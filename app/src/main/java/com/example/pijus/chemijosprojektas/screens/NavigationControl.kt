package com.example.pijus.chemijosprojektas.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pijus.chemijosprojektas.data.RecipeData
import com.example.pijus.chemijosprojektas.screens.CalculateAmount
import com.example.pijus.chemijosprojektas.screens.CalculateQuantities
import com.example.pijus.chemijosprojektas.screens.MainScreen
import kotlinx.serialization.json.Json

@Composable
fun NavigationControl(inputs: ArrayList<RecipeData>?) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "mainScreen") {
        composable("mainScreen") {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                if (inputs != null) {
                    MainScreen(inputs, navController)
                } else {
                    Text(text = "Failed to retrieve data")
                }
            }
        }

        composable("quantitiesScreen") { entry ->
            val serializedRecipe: String? = entry.savedStateHandle.get<String>("recipe")
            if (serializedRecipe != null) {
                val recipe = Json.decodeFromString<RecipeData>(serializedRecipe)
                CalculateQuantities(recipe)
            } else {
                Text(text = "Failed to load data")
            }
        }

        composable("amountScreen") { entry ->
            val serializedRecipe: String? = entry.savedStateHandle.get<String>("recipe")
            if (serializedRecipe != null) {
                val recipe = Json.decodeFromString<RecipeData>(serializedRecipe)
                CalculateAmount(recipe)
            } else {
                Text(text = "Failed to load data")
            }
        }
    }
}