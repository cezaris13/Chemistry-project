package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class kauke1 : AppCompatActivity() {
    var skaiciuotikk: Button? = null
    var ivestiskk: EditText? = null
    var rezultataskk: TextView? = null
    var rezultataskk2: TextView? = null
    var rezultataskk3: TextView? = null
    var receptaskau: TextView? = null
    var mieless = 5.5
    var vanduoo = 1.0
    var actass = 1.5

    /*
           1. 5, 5 g sausų mielių;
           2. 1,5 lašai acto;
           3. 1 šaukštelis vandens.
        */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kauke1)
        skaiciuotikk = findViewById(R.id.skaiciuotik)
        ivestiskk = findViewById(R.id.ivestisk)
        rezultataskk = findViewById(R.id.rezultatask)
        rezultataskk2 = findViewById(R.id.rezultatask2)
        rezultataskk3 = findViewById(R.id.rezultatask3)
        receptaskau = findViewById(R.id.receptaska)
        skaiciuotikk!!.setOnClickListener { v: View? ->
            if (ivestiskk?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Prašome įvesti kiekį", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val data = Integer.decode(ivestiskk?.text.toString())
                rezultataskk?.text = (data * mieless).toString() + " g mielių"
                rezultataskk2?.text = (data * vanduoo).toString() + " šaukstelių vandens"
                rezultataskk3?.text = (data * actass).toString() + " lašų acto"
                receptaskau?.text = " Darbo eiga: \n" +
                        "1.Indelyje maišykite mieles, actą ir vandenį, kol pasidarys tiršta masė. Jei reikia, įpilkite dar šiek tiek vandens, kad kaukę būtų galima tepti ant odos. \n" +
                        "2.Užtepkite kaukę ant odos. Palaikykite 10 – 15 min. \n" +
                        "3.Nuplaukite šiltu vandeniu ir nusausinkite."
            }
        }
    }
}