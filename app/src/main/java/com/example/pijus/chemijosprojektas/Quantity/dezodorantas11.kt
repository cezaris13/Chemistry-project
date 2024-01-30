package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class dezodorantas1 : AppCompatActivity() {
    var skaiciuotidd: Button? = null
    var ivestisdd: EditText? = null
    var rezultatasdd: TextView? = null
    var rezultatasdd2: TextView? = null
    var rezultatasdd3: TextView? = null
    var rezultatasdd4: TextView? = null
    var receptasdez: TextView? = null
    var soda = 2.0
    var krakmolas = 2.0
    var kokosai = 2.0
    var eter = 1.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dezodorantas1)
        skaiciuotidd = findViewById(R.id.skaiciuotid)
        ivestisdd = findViewById(R.id.ivestisd)
        rezultatasdd = findViewById(R.id.rezultatasd)
        rezultatasdd2 = findViewById(R.id.rezultatasd2)
        rezultatasdd3 = findViewById(R.id.rezultatasd3)
        rezultatasdd4 = findViewById(R.id.rezultatasd4)
        receptasdez = findViewById(R.id.receptasde)
        skaiciuotidd!!.setOnClickListener {
            if (ivestisdd?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Prašome įvesti kiekį", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val data = Integer.decode(ivestisdd?.text.toString())
                rezultatasdd?.text = (data * soda).toString() + " šaukštai sodos"
                rezultatasdd2?.text = (data * krakmolas).toString() + " šaukštai krakmolo"
                rezultatasdd3?.text = (data * kokosai).toString() + " šaukštai kokosų aliejaus"
                rezultatasdd4?.text = (data * eter).toString() + " šaukštai eterinio aliejaus"
                receptasdez?.text = "Darbo eiga: \n" + "Visas sudedamąsias dalys gerai išmaišyti, gautą masę sudėti į indą ir laikyti šaldytuve."
            }
        }
    }
}