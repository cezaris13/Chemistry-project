package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class vonioszele1 : AppCompatActivity() {
    var skaiciuoti: Button? = null
    var ivestis: EditText? = null
    var rezultatas: TextView? = null
    var rezultatas2: TextView? = null
    var rezultatas3: TextView? = null
    var receptasvv: TextView? = null
    var vanduo = 12.0
    var sampunas = 12.0
    var zelatina = 1.4

    /*
           1. 5, 5 g sausų mielių;
           2. 1,5 lašai acto;
           3. 1 šaukštelis vandens.
        */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vonioszele1)
        skaiciuoti = findViewById(R.id.skaiciuoti)
        ivestis = findViewById(R.id.ivestis)
        rezultatas = findViewById(R.id.rezultatas)
        rezultatas2 = findViewById(R.id.rezultatas2)
        rezultatas3 = findViewById(R.id.rezultatas3)
        receptasvv = findViewById(R.id.receptasv)
        skaiciuoti!!.setOnClickListener {    //to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if (ivestis?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Prašome įvesti kiekį", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val data = Integer.decode(ivestis?.text.toString())
                rezultatas?.text = (data * vanduo).toString() + " ml vandens"
                rezultatas2?.text = (data * sampunas).toString() + " ml šampūno"
                rezultatas3?.text = (data * zelatina).toString() + " g želatinos"
                receptasvv?.text = "Darbo eiga: \n" +
                        "1. Į užvirintą vandenį supilti želatiną ir ją ištirpinti. \n" +
                        "2. Įmaišykite šampūną. \n" +
                        "3. Atvėsinkite gautą masę. \n" +
                        "4. Sustingusią masę galima naudoti prausimuisi."
            }
        }
    }
}