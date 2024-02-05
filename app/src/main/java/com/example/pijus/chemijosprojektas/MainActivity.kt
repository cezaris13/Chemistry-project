package com.example.pijus.chemijosprojektas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.lifecycleScope
import com.example.pijus.chemijosprojektas.data.RecipeData
import com.example.pijus.chemijosprojektas.screens.NavigationControl
import com.example.pijus.chemijosprojektas.theme.MyApplicationTheme
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.GenericTypeIndicator
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

class MainActivity : ComponentActivity() {
    private suspend fun retrieveData(): ArrayList<RecipeData>? {
        val database = Firebase.database
        val myRef = database.getReference("recipeData")
        val dataSnapshot: DataSnapshot = myRef.get().await()
        val t: GenericTypeIndicator<ArrayList<RecipeData>?> =
            object : GenericTypeIndicator<ArrayList<RecipeData>?>() {}
        return dataSnapshot.getValue(t)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recipeData = MutableLiveData<ArrayList<RecipeData>?>()

        lifecycleScope.launch {
            recipeData.postValue(retrieveData())
        }

        setContent {
            val inputs: ArrayList<RecipeData>? by recipeData.observeAsState()

            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationControl(inputs)
                }
            }
        }
    }
}