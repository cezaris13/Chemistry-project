package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.R

class balzamas1 : AppCompatActivity() {
    var skaiciuotibbal: Button? = null
    var ivestisbbal: EditText? = null
    var rezultatasbbal: TextView? = null
    var rezultatasbbal2: TextView? = null
    var rezultatasbbal3: TextView? = null
    var rezultatasbbal4: TextView? = null
    var receptasbalzamas1: TextView? = null
    var alyvos = 23.0
    var vaskas = 17.0
    var medus = 6.0
    var vandekas = 0.05
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balzamas1)
        skaiciuotibbal = findViewById(R.id.skaiciuotibal)
        ivestisbbal = findViewById(R.id.ivestisbal)
        rezultatasbbal = findViewById(R.id.rezultatasbal)
        rezultatasbbal2 = findViewById(R.id.rezultatasbal2)
        rezultatasbbal3 = findViewById(R.id.rezultatasbal3)
        rezultatasbbal4 = findViewById(R.id.rezultatasbal4)
        receptasbalzamas1 = findViewById(R.id.receptasbalzamas)
        skaiciuotibbal!!.setOnClickListener { v: View? ->  //to do: patikrinti ar yra tuscia, ar nepakites tekstas ir paspaudus kad isnyktu tekstas
            if (ivestisbbal?.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Prašome įvesti kiekį", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val data = Integer.decode(ivestisbbal?.text.toString())
                rezultatasbbal?.text = (data * alyvos).toString() + " g alyvuogių aliejaus"
                rezultatasbbal2?.text = (data * vaskas).toString() + " g bicčių vaško"
                rezultatasbbal3?.text = (data * medus).toString() + " g želatinos"
                rezultatasbbal4?.text = (data * vandekas).toString() + " ml vandens"
                receptasbalzamas1?.text = "Darbo eiga: \n" + "1.Aliejuje ištirpinti vašką. Neleisti užvirti \n" +
                        "2.Kai aliejus ir vaškas susimaišys, įmaišyti medų.\n" +
                        "3. Įlašinti vitaminą E.\n" +
                        "4. Gautą mišinį palikti atvėsti.\n" +
                        "5. Balzamą laikyti šaldytuve.\n" +
                        "6. Naudoti tik sustingusį."
            }
        }
    }
}