package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class balinamoji1 : AppCompatActivity() {
    var skaiciuotibb: Button? = null
    var ivestisbb: EditText? = null
    var rezultatasbb: TextView? = null
    var rezultatasbb2: TextView? = null
    var rezultatasbb3: TextView? = null
    var receptasbalinamoji1: TextView? = null
    var ciber = 1.0
    var kokos = 1.0
    var eteris = 2.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balinamoji1)
        skaiciuotibb = findViewById(R.id.skaiciuotib)
        ivestisbb = findViewById(R.id.ivestisb)
        rezultatasbb = findViewById(R.id.rezultatasb)
        rezultatasbb2 = findViewById(R.id.rezultatasb2)
        rezultatasbb3 = findViewById(R.id.rezultatasb3)
        receptasbalinamoji1 = findViewById(R.id.receptasbalinamoji)
        skaiciuotibb!!.setOnClickListener {    //to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if (ivestisbb?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Prašome įvesti kiekį", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            val data = Integer.decode(ivestisbb?.text.toString())
            rezultatasbb?.text = (data * ciber).toString() + " arbatinių šaukštelių ciberžolės"
            rezultatasbb2?.text = (data * kokos).toString() + " arbatinių šaukštelių kokosų aliejaus"
            rezultatasbb3?.text = (data * eteris).toString() + " lašų metų eterinio aliejaus"
            receptasbalinamoji1?.text = "Darbo eiga: \n" + "Viską sumaišyti ir valyti dantis 2-3 kartus per dieną.\n" +
                    "Kuo dažniau naudosite pastą, tuo greičiau pasieksite efektą."
        }
    }
}