package com.example.pijus.chemijosprojektas

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.GenericTypeIndicator
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await


class MainActivity : AppCompatActivity() {
    private val toastMessage = "Prašome pasirinkti nors vieną receptą"

    //    ArrayList<RadioButton>
    private var radioButtons: ArrayList<RadioButton> = ArrayList()

    var radioGroup: RadioGroup? = null

    private var kelintaspage = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        radioGroup = findViewById(R.id.radioGroup)
        radioButtons.add(findViewById(R.id.RadioButton))
        radioButtons.add(findViewById(R.id.RadioButton2))
        radioButtons.add(findViewById(R.id.RadioButton3))
        radioButtons.add(findViewById(R.id.RadioButton4))
        radioButtons.add(findViewById(R.id.RadioButton5))
        radioButtons.add(findViewById(R.id.RadioButton6))
        radioButtons.add(findViewById(R.id.RadioButton7))
        radioButtons.add(findViewById(R.id.RadioButton8))
        radioButtons.add(findViewById(R.id.RadioButton9))
        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener {
            lifecycleScope.launch {
                openPage(calculateAmount = false)
            }        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            lifecycleScope.launch {
                openPage(calculateAmount = true)
            }
        }
    }

    private suspend fun openPage(calculateAmount: Boolean) {
        if (kelintaspage == 0) {
            Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_LONG).show()
        } else {
            val database = Firebase.database
            val myRef = database.getReference("recipeData")
            val dataSnapshot: DataSnapshot = myRef.get().await()
            val t: GenericTypeIndicator<ArrayList<RecipeData>?> = object : GenericTypeIndicator<ArrayList<RecipeData>?>() {}
            val recipeData: ArrayList<RecipeData>? = dataSnapshot.getValue(t)

            if (recipeData != null) {
                setContent {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "exampleComposeView"
                    ) {
                        composable("exampleComposeView") {
                            if (calculateAmount) {
                                CalculateAmount(recipeData[kelintaspage + 1])
                            } else {
                                CalculateQuantities(recipeData[kelintaspage + 1])
                            }
                        }
                    }
                }
            }
        }
    }

    private fun setRadioButton(radioButtonId: Int) {
        for (i in radioButtons.indices) {
            radioButtons[i].isChecked = radioButtonId == i
        }
        kelintaspage = radioButtonId
    }

    fun funkcija(v: View?) {
        setRadioButton(1)
    }

    fun funkcija2(v: View?) {
        setRadioButton(2)
    }

    fun funkcija3(v: View?) {
        setRadioButton(3)
    }

    fun funkcija4(v: View?) {
        setRadioButton(4)
    }

    fun funkcija5(v: View?) {
        setRadioButton(5)
    }

    fun funkcija6(v: View?) {
        setRadioButton(6)
    }

    fun funkcija7(v: View?) {
        setRadioButton(7)
    }

    fun funkcija8(v: View?) {
        setRadioButton(8)
    }

    fun funkcija9(v: View?) {
        setRadioButton(9)
    }
}