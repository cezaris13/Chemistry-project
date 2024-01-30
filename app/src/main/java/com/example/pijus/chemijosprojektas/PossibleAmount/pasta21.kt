package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class pasta2 : AppCompatActivity() {
    var voniaskaiciuoti: Button? = null
    var pirmasvonia: EditText? = null
    var antrasvonia: EditText? = null
    var treciasvonia: EditText? = null
    var atsakymas: TextView? = null
    var milteliaii = 7.5
    var druskaa = 1.0
    var gliceroliss = 2.8
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasta2)
        voniaskaiciuoti = findViewById(R.id.buttonp3)
        pirmasvonia = findViewById(R.id.ivestisp1)
        antrasvonia = findViewById(R.id.ivestisp2)
        treciasvonia = findViewById(R.id.ivestisp3)
        atsakymas = findViewById(R.id.textViewp2)
        voniaskaiciuoti!!.setOnClickListener { v: View? ->
            atsakymas?.text = ""
            if (pirmasvonia?.text.toString().isEmpty() || antrasvonia?.text.toString()
                    .isEmpty() || treciasvonia?.text.toString().isEmpty()
            ) {
                Toast.makeText(
                    applicationContext,
                    "Prašome užpildyti visus langelius",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                val vanduo1: Double = pirmasvonia?.text.toString().toDouble()
                val vanduo2: Double = antrasvonia?.text.toString().toDouble()
                val vanduo3: Double = treciasvonia?.text.toString().toDouble()
                var min = 100000.0
                if (min > vanduo1 / milteliaii) {
                    min = vanduo1
                }
                if (min > vanduo2 / druskaa) {
                    min = vanduo2
                }
                if (min > vanduo3 / gliceroliss) {
                    min = vanduo3
                }
                atsakymas?.text = String.format("%.2f", min) + "porcijų"
            }
        }
    }
}