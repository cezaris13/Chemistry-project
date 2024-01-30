package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class unknown2 : AppCompatActivity() {
    var voniaskaiciuoti: Button? = null
    var pirmasvonia: EditText? = null
    var antrasvonia: EditText? = null
    var treciasvonia: EditText? = null
    var atsakymas: TextView? = null
    var mltai = 15.0
    var druska = 5.6
    var vanduoooo = 8.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unknown2)
        voniaskaiciuoti = findViewById(R.id.buttonu3)
        pirmasvonia = findViewById(R.id.ivestisu1)
        antrasvonia = findViewById(R.id.ivestisu2)
        treciasvonia = findViewById(R.id.ivestisu3)
        atsakymas = findViewById(R.id.textViewu2)
        voniaskaiciuoti!!.setOnClickListener {
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
                if (min > vanduo1 / mltai) {
                    min = vanduo1 / mltai
                }
                if (min > vanduo2 / vanduoooo) {
                    min = vanduo2 / vanduoooo
                }
                if (min > vanduo3 / druska) {
                    min = vanduo3 / druska
                }
                atsakymas?.text = String.format("%.2f", min) + "porcijų"
            }
        }
    }
}