package com.example.pijus.chemijosprojektas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pijus.chemijosprojektas.PossibleAmount.avizos2
import com.example.pijus.chemijosprojektas.PossibleAmount.balinamoji2
import com.example.pijus.chemijosprojektas.PossibleAmount.balzamas2
import com.example.pijus.chemijosprojektas.PossibleAmount.dezodorantas2
import com.example.pijus.chemijosprojektas.PossibleAmount.kauke2
import com.example.pijus.chemijosprojektas.PossibleAmount.losjonas2
import com.example.pijus.chemijosprojektas.PossibleAmount.pasta2
import com.example.pijus.chemijosprojektas.PossibleAmount.unknown2
import com.example.pijus.chemijosprojektas.PossibleAmount.vonioszele2
import com.example.pijus.chemijosprojektas.Quantity.avizos1
import com.example.pijus.chemijosprojektas.Quantity.balinamoji1
import com.example.pijus.chemijosprojektas.Quantity.balzamas1
import com.example.pijus.chemijosprojektas.Quantity.dezodorantas1
import com.example.pijus.chemijosprojektas.Quantity.kauke1
import com.example.pijus.chemijosprojektas.Quantity.losjonas1
import com.example.pijus.chemijosprojektas.Quantity.pasta1
import com.example.pijus.chemijosprojektas.Quantity.unknown1
import com.example.pijus.chemijosprojektas.Quantity.vonioszele1

open class MainActivity : AppCompatActivity() {
    private val toastMessage = "prasome pasirinkti nors viena recepta"
    private val pages1: ArrayList<Class<*>?> = object : ArrayList<Class<*>?>() {
        init {
            add(vonioszele1::class.java)
            add(kauke1::class.java)
            add(unknown1::class.java)
            add(balzamas1::class.java)
            add(losjonas1::class.java)
            add(dezodorantas1::class.java)
            add(pasta1::class.java)
            add(balinamoji1::class.java)
            add(avizos1::class.java)
        }
    }
    var pages2: ArrayList<Class<*>?> = object : ArrayList<Class<*>?>() {
        init {
            add(vonioszele2::class.java)
            add(kauke2::class.java)
            add(unknown2::class.java)
            add(balzamas2::class.java)
            add(losjonas2::class.java)
            add(dezodorantas2::class.java)
            add(pasta2::class.java)
            add(balinamoji2::class.java)
            add(avizos2::class.java)
        }
    }

    //    ArrayList<RadioButton>
    var pirmas: RadioButton? = null
    var antras: RadioButton? = null
    var trecias: RadioButton? = null
    var ketvirtas: RadioButton? = null
    var penktas: RadioButton? = null
    var sestas: RadioButton? = null
    var septintas: RadioButton? = null
    var astuntas: RadioButton? = null
    var devintas: RadioButton? = null
    var kelintaspage = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pirmas = findViewById(R.id.RadioButton)
        antras = findViewById(R.id.RadioButton2)
        trecias = findViewById(R.id.RadioButton3)
        ketvirtas = findViewById(R.id.RadioButton4)
        penktas = findViewById(R.id.RadioButton5)
        sestas = findViewById(R.id.RadioButton6)
        septintas = findViewById(R.id.RadioButton7)
        astuntas = findViewById(R.id.RadioButton8)
        devintas = findViewById(R.id.RadioButton9)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener { v: View? ->
            if (kelintaspage == 0) {
                Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_LONG).show()
            } else {
                startActivity(Intent(applicationContext, pages1[kelintaspage + 1]))
            }
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            if (kelintaspage == 0) {
                Toast.makeText(applicationContext, toastMessage, Toast.LENGTH_LONG).show()
            } else {
                startActivity(Intent(applicationContext, pages2[kelintaspage + 1]))
            }
        }
    }

    //problema: jei useris nuims savo pasirinkima bus blogai
    fun funkcija() {
        if (pirmas!!.isChecked) {
            antras!!.isChecked = false
            trecias!!.isChecked = false
            ketvirtas!!.isChecked = false
            penktas!!.isChecked = false
            sestas!!.isChecked = false
            septintas!!.isChecked = false
            astuntas!!.isChecked = false
            devintas!!.isChecked = false
            kelintaspage = 1
        }
    }

    fun funkcija2() {
        pirmas!!.isChecked = false
        trecias!!.isChecked = false
        ketvirtas!!.isChecked = false
        penktas!!.isChecked = false
        sestas!!.isChecked = false
        septintas!!.isChecked = false
        astuntas!!.isChecked = false
        devintas!!.isChecked = false
        kelintaspage = 2
    }

    fun funkcija3() {
        pirmas!!.isChecked = false
        antras!!.isChecked = false
        ketvirtas!!.isChecked = false
        penktas!!.isChecked = false
        sestas!!.isChecked = false
        septintas!!.isChecked = false
        astuntas!!.isChecked = false
        devintas!!.isChecked = false
        kelintaspage = 3
    }

    fun funkcija4() {
        pirmas!!.isChecked = false
        antras!!.isChecked = false
        trecias!!.isChecked = false
        penktas!!.isChecked = false
        sestas!!.isChecked = false
        septintas!!.isChecked = false
        astuntas!!.isChecked = false
        devintas!!.isChecked = false
        kelintaspage = 4
    }

    fun funkcija5() {
        pirmas!!.isChecked = false
        antras!!.isChecked = false
        trecias!!.isChecked = false
        ketvirtas!!.isChecked = false
        sestas!!.isChecked = false
        septintas!!.isChecked = false
        astuntas!!.isChecked = false
        devintas!!.isChecked = false
        kelintaspage = 5
    }

    fun funkcija6() {
        pirmas!!.isChecked = false
        antras!!.isChecked = false
        trecias!!.isChecked = false
        ketvirtas!!.isChecked = false
        penktas!!.isChecked = false
        septintas!!.isChecked = false
        astuntas!!.isChecked = false
        devintas!!.isChecked = false
        kelintaspage = 6
    }

    fun funkcija7() {
        pirmas!!.isChecked = false
        antras!!.isChecked = false
        trecias!!.isChecked = false
        ketvirtas!!.isChecked = false
        penktas!!.isChecked = false
        sestas!!.isChecked = false
        astuntas!!.isChecked = false
        devintas!!.isChecked = false
        kelintaspage = 7
    }

    fun funkcija8() {
        pirmas!!.isChecked = false
        antras!!.isChecked = false
        trecias!!.isChecked = false
        ketvirtas!!.isChecked = false
        penktas!!.isChecked = false
        sestas!!.isChecked = false
        septintas!!.isChecked = false
        devintas!!.isChecked = false
        kelintaspage = 8
    }

    fun funkcija9() {
        pirmas!!.isChecked = false
        antras!!.isChecked = false
        trecias!!.isChecked = false
        ketvirtas!!.isChecked = false
        penktas!!.isChecked = false
        sestas!!.isChecked = false
        septintas!!.isChecked = false
        astuntas!!.isChecked = false
        kelintaspage = 9
    }
}