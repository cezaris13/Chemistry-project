package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

open class avizos2 : BaseCalculatePortionsActivity() {
    var dribsniai = 6.0
    var miltai = 5.0
    var vendens = 1.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avizos2)
        calculateButton = findViewById(R.id.buttona3)
        editTexts.add(findViewById(R.id.ivestisa1))
        editTexts.add(findViewById(R.id.ivestisa2))
        editTexts.add(findViewById(R.id.ivestisa3))
        ingredients.add(dribsniai)
        ingredients.add(miltai)
        ingredients.add(vendens)
        answer = findViewById(R.id.textViewa2)
        calculateButton!!.setOnClickListener { calculatePortion() }
    }
}