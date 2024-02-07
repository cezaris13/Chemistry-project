package com.example.pijus.chemijosprojektas.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pijus.chemijosprojektas.data.RecipeData
import kotlinx.serialization.json.Json

@Composable
fun NavigationControl(inputs: ArrayList<RecipeData>?) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "mainScreen") {
        composable("mainScreen") {
            if (inputs != null) {
                MainScreen(inputs, navController)
            } else {
                Text(text = "Failed to retrieve data")
            }
        }

        composable("quantitiesScreen/{recipe}") { entry ->
            val serializedRecipe: String? = entry.arguments?.getString("recipe")
            if (serializedRecipe != null) {
                val recipe = Json.decodeFromString<RecipeData>(serializedRecipe)
                CalculateQuantities(recipe)
            } else {
                Text(text = "Failed to load data")
            }
        }

        composable("amountScreen/{recipe}") { entry ->
            val serializedRecipe: String? = entry.arguments?.getString("recipe")
            if (serializedRecipe != null) {
                val recipe = Json.decodeFromString<RecipeData>(serializedRecipe)
                CalculateAmount(recipe)
            } else {
                Text(text = "Failed to load data")
            }
        }
    }
}