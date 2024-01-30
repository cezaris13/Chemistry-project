package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class vonioszele2 : AppCompatActivity() {
    var voniaskaiciuoti: Button? = null
    var pirmasvonia: EditText? = null
    var antrasvonia: EditText? = null
    var treciasvonia: EditText? = null
    var atsakymas: TextView? = null
    var zelle = 12.0
    var vanduoo = 12.0
    var sampunass = (14 / 10).toDouble()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vonioszele2)
        voniaskaiciuoti = findViewById(R.id.button3)
        pirmasvonia = findViewById(R.id.ivestis1)
        antrasvonia = findViewById(R.id.ivestis2)
        treciasvonia = findViewById(R.id.ivestis3)
        atsakymas = findViewById(R.id.textView2)
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
                if (min > vanduo1 / zelle) {
                    min = vanduo1 / zelle
                }
                if (min > vanduo2 / sampunass) {
                    min = vanduo2 / sampunass
                }
                if (min > vanduo3 / vanduoo) {
                    min = vanduo3 / vanduoo
                }
                atsakymas?.text = String.format("%.2f", min) + "porcijų"
            }
        }
    }
}