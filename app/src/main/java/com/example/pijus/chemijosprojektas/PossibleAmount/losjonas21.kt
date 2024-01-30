package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class losjonas2 : AppCompatActivity() {
    var voniaskaiciuoti: Button? = null
    var pirmasvonia: EditText? = null
    var antrasvonia: EditText? = null
    var treciasvonia: EditText? = null
    var ketvirtasvonia: EditText? = null
    var penktasvonia: EditText? = null
    var atsakymas: TextView? = null
    var aliejus = 22.0
    var vaskas = 12.0
    var lasas = 1.0
    var alavijo = 5.0
    var E = 1.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_losjonas2)
        voniaskaiciuoti = findViewById(R.id.buttonl3)
        pirmasvonia = findViewById(R.id.ivestisl1)
        antrasvonia = findViewById(R.id.ivestisl2)
        treciasvonia = findViewById(R.id.ivestisl3)
        ketvirtasvonia = findViewById(R.id.ivestisl4)
        penktasvonia = findViewById(R.id.ivestisl5)
        atsakymas = findViewById(R.id.textViewl2)
        voniaskaiciuoti!!.setOnClickListener {
            atsakymas?.text = ""
            if (pirmasvonia?.text.toString().isEmpty() || antrasvonia?.text.toString()
                    .isEmpty() || treciasvonia?.text.toString()
                    .isEmpty() || ketvirtasvonia?.text.toString()
                    .isEmpty() || penktasvonia?.text.toString().isEmpty()
            ) {
                Toast.makeText(
                    applicationContext,
                    "Prašome užpildyti visus langelius",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                val vanduo1: Double = pirmasvonia?.text.toString().toDouble()
                val vanduo2: Double = antrasvonia?.text.toString().toDouble()
                val vanduo4: Double = ketvirtasvonia?.text.toString().toDouble()
                val vanduo3: Double = treciasvonia?.text.toString().toDouble()
                val vanduo5: Double = penktasvonia?.text.toString().toDouble()
                var min = 100000.0
                if (min > vanduo1 / aliejus) {
                    min = vanduo1 / aliejus
                }
                if (min > vanduo2 / vaskas) {
                    min = vanduo2 / vaskas
                }
                if (min > vanduo3 / lasas) {
                    min = vanduo3 / lasas
                }
                if (min > vanduo4 / alavijo) {
                    min = vanduo4 / alavijo
                }
                if (min > vanduo5 / E) {
                    min = vanduo5 / E
                }
                atsakymas?.text = String.format("%.2f", min) + "porcijų"
            }
        }
    }
}