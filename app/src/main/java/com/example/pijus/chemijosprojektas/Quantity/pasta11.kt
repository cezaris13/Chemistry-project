package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class pasta1 : AppCompatActivity() {
    var skaiciuotipp: Button? = null
    var ivestispp: EditText? = null
    var rezultataspp: TextView? = null
    var rezultataspp2: TextView? = null
    var rezultataspp3: TextView? = null
    var receptaspp: TextView? = null
    var milteliai = 7.5
    var druska = 1.0
    var glizerolis = 1.8
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasta1)
        skaiciuotipp = findViewById(R.id.skaiciuotip)
        ivestispp = findViewById(R.id.ivestisp)
        rezultataspp = findViewById(R.id.rezultatasp)
        rezultataspp2 = findViewById(R.id.rezultatasp2)
        rezultataspp3 = findViewById(R.id.rezultatasp3)
        receptaspp = findViewById(R.id.receptaspp)
        skaiciuotipp!!.setOnClickListener {    //to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if (ivestispp?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Prašome įvesti kiekį", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val data = Integer.decode(ivestispp?.text.toString())
                rezultataspp?.text = (data * milteliai).toString() + " g kepimo miltelių"
                rezultataspp2?.text = (data * druska).toString() + " g druskos"
                rezultataspp3?.text = (data * glizerolis).toString() + " ml glicerolio"
                receptaspp?.text = " Darbo eiga: \n" +
                        "1. Sumašykite miltelius ir druską. \n" +
                        "2. Spilkite glicerolį. \n" +
                        "3. Pilkite iš lėto vandenį, kol gausite tinkamos konsistencijos masę."
            }
        }
    }
}