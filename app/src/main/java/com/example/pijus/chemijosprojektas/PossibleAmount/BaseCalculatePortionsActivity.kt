package com.example.pijus.chemijosprojektas.PossibleAmount

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseCalculatePortionsActivity : AppCompatActivity() {
    var toastMessage = "Prašome užpildyti visus langelius"
    var editTexts: ArrayList<EditText> = ArrayList()
    var calculateButton: Button? = null
    var answer: TextView? = null
    var ingredients = ArrayList<Double>()
    fun calculatePortion() {
        answer?.text = ""
        for (i in editTexts.indices) {
            if (editTexts[i].toString().isEmpty()) {
                Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_LONG).show()
                return
            }
        }
        var min = 100000.0
        editTexts.indices.forEach { i ->
            val value: Double = editTexts[i].text.toString().toDouble()
            if (min > value / ingredients[i]) min = value / ingredients[i]
        }
        answer?.text = String.format("%.2f", min) + "porcijų"
    }
}