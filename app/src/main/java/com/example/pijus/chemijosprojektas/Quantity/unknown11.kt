package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class unknown1 : AppCompatActivity() {
    var skaiciuotiuu: Button? = null
    var ivestisuu: EditText? = null
    var rezultatasuu: TextView? = null
    var rezultatasuu2: TextView? = null
    var rezultatasuu3: TextView? = null
    var receptasunknown: TextView? = null
    var miltai = 15.0
    var druska = 5.6
    var vanduooo = 8.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unknown1)
        skaiciuotiuu = findViewById(R.id.skaiciuotiu)
        ivestisuu = findViewById(R.id.ivestisu)
        rezultatasuu = findViewById(R.id.rezultatasu)
        rezultatasuu2 = findViewById(R.id.rezultatasu2)
        rezultatasuu3 = findViewById(R.id.rezultatasu3)
        receptasunknown = findViewById(R.id.receptasun)
        skaiciuotiuu!!.setOnClickListener {
            if (ivestisuu?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Prašome įvesti kiekį", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val data = Integer.decode(ivestisuu?.text.toString())
                rezultatasuu?.text = (data * miltai).toString() + " g miltų"
                rezultatasuu2?.text = (data * druska).toString() + " g druskos"
                rezultatasuu3?.text = (data * vanduooo).toString() + " ml vandens"
                receptasunknown?.text = "Darbo eiga: \n" +
                        "1. Iš sudėtinių dalių suminkykite tešlą. \n" +
                        "2. Gaminkite norimą skulptūrą."
            }
        }
    }
}