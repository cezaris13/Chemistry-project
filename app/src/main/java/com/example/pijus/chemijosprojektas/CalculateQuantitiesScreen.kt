package com.example.pijus.chemijosprojektas

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CalculateQuantities(recipeData: RecipeData) {
    val toastMessage = "Prašome įvesti kiekį"
    val calculateButtonMessage = "Skaičiuoti"
    val pattern = Regex("^\\d+\$")
    val context = LocalContext.current

    var input by remember { mutableStateOf("") }
    var recipeText by remember { mutableStateOf("") }
    val ingredientList = remember { mutableStateListOf<String>() }

    if (ingredientList.toList().isEmpty())
        for (i in recipeData.ingredients.indices)
            ingredientList.add("")

    fun calculatePortion() {
        if (input.isEmpty()) {
            Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show()
            return
        }

        for (i: Int in recipeData.ingredients.indices) {
            ingredientList[i] =
                "${(input.toInt() * recipeData.ingredients[i])}${recipeData.ingredientsText[i]}"
        }
        recipeText = recipeData.recipe
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = input,
            onValueChange = {
                if (it.isEmpty() || it.matches(pattern))
                    input = it
            },
            placeholder = {
                Text(text = recipeData.placeHolderText)
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        LazyColumn {
            items(count = ingredientList.size) { index ->
                Text(text = ingredientList[index], modifier = Modifier.fillMaxWidth())
            }
        }
        Text(text = recipeText, modifier = Modifier.fillMaxWidth())
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { calculatePortion() }, modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = calculateButtonMessage)
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFF, group = "UI preview")
@Composable
fun PreviewCalculateQuantities() {
    val recipeData = RecipeData(List(2) { 1.0 }, List(2) { "a" }, "testas", "receptas")
    CalculateQuantities(recipeData)
}
