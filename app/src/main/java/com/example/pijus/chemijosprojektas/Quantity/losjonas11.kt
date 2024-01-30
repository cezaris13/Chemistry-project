package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class losjonas1 : AppCompatActivity() {
    var skaiciuotill: Button? = null
    var ivestisll: EditText? = null
    var rezultatasll: TextView? = null
    var rezultatasll2: TextView? = null
    var rezultatasll3: TextView? = null
    var rezultatasll4: TextView? = null
    var rezultatasll5: TextView? = null
    var receptaslos: TextView? = null
    var aliejus = 22.0
    var vaskas = 12.0
    var lasas = 1.0
    var alavijo = 5.0
    var E = 1.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_losjonas1)
        skaiciuotill = findViewById(R.id.skaiciuotil)
        ivestisll = findViewById(R.id.ivestisl)
        rezultatasll = findViewById(R.id.rezultatasl)
        rezultatasll2 = findViewById(R.id.rezultatasl2)
        rezultatasll3 = findViewById(R.id.rezultatasl3)
        rezultatasll4 = findViewById(R.id.rezultatasl4)
        rezultatasll5 = findViewById(R.id.rezultatasl5)
        receptaslos = findViewById(R.id.receptaslo)
        skaiciuotill!!.setOnClickListener {
            if (ivestisll?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Prašome įvesti kiekį", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val data = Integer.decode(ivestisll?.text.toString())
                rezultatasll?.text = (data * aliejus).toString() + " g aliejaus"
                rezultatasll2?.text = (data * vaskas).toString() + " g bičių vaško"
                rezultatasll3?.text = (data * lasas).toString() + " lašų eterinio aliejaus"
                rezultatasll4?.text = (data * alavijo).toString() + " lašų alavijo"
                rezultatasll5?.text = (data * E).toString() + " tablečių vitamino E"
                receptaslos?.text = "Darbo eiga: \n" +
                        "1. Aliejuje ištirpinti vašką. Neleisti užvirti.\n" +
                        "2.  Į šia masę pilti vitaminą E, eterinį aliejų ir alaviją. \n" +
                        "3. Visą masę gerai išmaišyti. \n" +
                        "4. Tepkite ant odos."
            }
        }
    }
}