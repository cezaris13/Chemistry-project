package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class kauke2 : AppCompatActivity() {
    var voniaskaiciuoti: Button? = null
    var pirmasvonia: EditText? = null
    var antrasvonia: EditText? = null
    var treciasvonia: EditText? = null
    var atsakymas: TextView? = null
    var mieless = 5.5
    var vanduoo = 1.0
    var actass = 1.5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kauke2)
        voniaskaiciuoti = findViewById(R.id.buttonk3)
        pirmasvonia = findViewById(R.id.ivestisk1)
        antrasvonia = findViewById(R.id.ivestisk2)
        treciasvonia = findViewById(R.id.ivestisk3)
        atsakymas = findViewById(R.id.textViewk2)
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
                if (min > vanduo1 / mieless) {
                    min = vanduo1 / mieless
                }
                if (min > vanduo2 / actass) {
                    min = vanduo2 / actass
                }
                if (min > vanduo3 / vanduoo) {
                    min = vanduo3 / vanduoo
                }
                atsakymas?.text = String.format("%.2f", min) + "porcijų"
            }
        }
    }
}