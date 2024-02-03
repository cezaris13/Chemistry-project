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
fun CalculateAmount(recipeData: RecipeData) {
    val toastMessage = "Prašome įvesti kiekį"
    val calculateButtonMessage = "Skaičiuoti"
    val pattern = Regex("^\\d+\$")
    val context = LocalContext.current

    val inputs = remember { mutableStateListOf<String>() }
    var result by remember { mutableStateOf("") }

    if (inputs.toList().isEmpty())
        for (i in recipeData.ingredients.indices) {
            inputs.add("")
        }

    fun calculateAmount() {
        result = ""
        for (i in inputs.indices) {
            if (inputs[i].isEmpty()) {
                Toast.makeText(context, toastMessage, Toast.LENGTH_LONG).show()
                return
            }
        }
        var min = 100000.0
        inputs.indices.forEach { i ->
            val value: Double = inputs[i].toDouble()
            if (min > value / recipeData.ingredients[i]) min = value / recipeData.ingredients[i]
        }
        result = String.format("%.2f", min) + " porcijų"
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn {
            items(count = inputs.size) { index ->
                OutlinedTextField(
                    value = inputs[index],
                    onValueChange = {
                        if (it.isEmpty() || it.matches(pattern))
                            inputs[index] = it
                    },
                    placeholder = {
                        Text(text = recipeData.ingredientsHintText[index])
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
        Text(text = result, modifier = Modifier.fillMaxWidth())
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { calculateAmount() }, modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = calculateButtonMessage)
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFF, group = "UI preview")
@Composable
fun PreviewCalculateAmount() {
    val recipeData = RecipeData(List(2) { 1.0 }, List(2) { "a" }, List(2) { "a" }, "testas", "receptas")
    CalculateAmount(recipeData)
}
