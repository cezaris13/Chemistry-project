package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class BaseQuantityActivity : AppCompatActivity() {
    private val toastMessage = "Prašome įvesti kiekį"
    var results: ArrayList<TextView> = ArrayList()
    var ingredients = ArrayList<Double>()
    var ingredientText = ArrayList<String>()
    var recipe = ""
    var calculateResults: Button? = null
    var input: EditText? = null
    var recipeView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balinamoji1)
        calculateResults = findViewById(R.id.skaiciuotib)
        input = findViewById(R.id.ivestisb)
        results.add(findViewById(R.id.rezultatasb))
        results.add(findViewById(R.id.rezultatasb2))
        results.add(findViewById(R.id.rezultatasb3))
        recipeView = findViewById(R.id.receptasbalinamoji)
        calculateResults!!.setOnClickListener { calculateButton() }
    }

    private fun calculateButton() {
        if (input?.text.toString().isEmpty()) {
            Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_SHORT).show()
            return
        }
        val data = Integer.decode(input?.text.toString())
        for (i in results.indices) {
            results[i].text = (data * ingredients[i]).toString() + ingredientText[i]
        }
        recipeView?.text = recipe
    }
}