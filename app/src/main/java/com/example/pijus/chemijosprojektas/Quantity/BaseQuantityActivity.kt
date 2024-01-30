package com.example.pijus.chemijosprojektas.Quantity

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseQuantityActivity : AppCompatActivity() {
    private val toastMessage = "Prašome įvesti kiekį"
    var results: ArrayList<TextView> = ArrayList()
    var ingredients = ArrayList<Double>()
    var ingredientText = ArrayList<String>()
    var recipe = ""
    var calculateResults: Button? = null
    var input: EditText? = null
    var recipeView: TextView? = null

    fun calculateButton() {
        if (input?.text.toString().isEmpty()) {
            Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_SHORT).show()
            return
        }
        val data = Integer.decode(input?.text.toString())
        results.indices.forEach { i ->
            results[i].text = (data * ingredients[i]).toString() + ingredientText[i]
        }
        recipeView?.text = recipe
    }
}