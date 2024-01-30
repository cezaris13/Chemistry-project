package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.pijus.chemijosprojektas.R

class avizos1 : AppCompatActivity() {
    var skaiciuotia: Button? = null
    var ivestisa: EditText? = null
    var rezultatasaa: TextView? = null
    var rezultatasaa2: TextView? = null
    var rezultatasaa3: TextView? = null
    var receptasavi: TextView? = null
    var dribsniai = 6.0
    var miltai = 5.0
    var vendens = 1.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avizos1)
        skaiciuotia = findViewById(R.id.skaiciuotia)
        ivestisa = findViewById(R.id.ivestisa)
        rezultatasaa = findViewById(R.id.rezultatasa)
        rezultatasaa2 = findViewById(R.id.rezultatasa2)
        rezultatasaa3 = findViewById(R.id.rezultatasa3)
        receptasavi = findViewById(R.id.receptasav)
        skaiciuotia!!.setOnClickListener {    //to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if (ivestisa?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Prašome įvesti kiekį", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            val data = Integer.decode(ivestisa?.text.toString())
            rezultatasaa?.text = (data * dribsniai).toString() + " g avižinių dribsnių"
            rezultatasaa2?.text = (data * miltai).toString() + " g kepimo miltelių"
            rezultatasaa3?.text = (data * vendens).toString() + " ml vandens"
            receptasavi?.text = "Darbo eiga: \n" +
                    "1.Nusivalykite veido odą. \n" +
                    "2.Indelyje sumaišykite dribsnius su soda.\n" +
                    "3.Įpilkite drungno vandens, kad gautumėte pastą. \n" +
                    "4.Švelniai trinkite veidą. \n" +
                    "5.Nusiprauskite ir nusausinkite."
        }
    }
}