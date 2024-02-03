package com.example.pijus.chemijosprojektas.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.pijus.chemijosprojektas.data.RecipeData
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


@Composable
fun MainScreen(
    recipeData: List<RecipeData>,
    navController: NavController
) {
    val recipeNames = recipeData.map { recipe -> recipe.name }
    var selectedName by remember { mutableStateOf(recipeNames[0]) }
    var selectedOptionIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        recipeNames.forEach { recipeName ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = (recipeName == selectedName),
                    onClick = {
                        selectedName = recipeName
                        selectedOptionIndex = recipeNames.indexOf(recipeName)
                    }
                )
                Text(
                    text = recipeName,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                val jsonRecipe = Json.encodeToString(recipeData[selectedOptionIndex])
                navController.navigate("quantitiesScreen/$jsonRecipe")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Kiek reikės")
        }
        Button(
            onClick = {
                val jsonRecipe = Json.encodeToString(recipeData[selectedOptionIndex])
                navController.navigate("amountScreen/$jsonRecipe")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Kiek išeis")
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFF, group = "UI preview")
@Composable
fun MainScreenPreview() {
    MyApplicationTheme {
        MainScreen(
            List(2) {
                RecipeData(
                    "testas",
                    List(2) { 1.0 },
                    List(2) { "a" },
                    List(2) { "a" },
                    "testas",
                    "receptas"
                )
            },
            navController = rememberNavController()
        )
    }
}