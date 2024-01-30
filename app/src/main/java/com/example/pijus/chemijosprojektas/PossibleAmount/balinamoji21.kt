package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import android.view.View
import com.example.pijus.chemijosprojektas.R

open class balinamoji2 : BaseCalculatePortionsActivity() {
    var ciber = 1.0
    var kokos = 1.0
    var eteris = 2.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balinamoji2)
        calculateButton = findViewById(R.id.buttonb3)
        editTexts.add(findViewById(R.id.ivestisb1))
        editTexts.add(findViewById(R.id.ivestisb2))
        editTexts.add(findViewById(R.id.ivestisb3))
        ingredients.add(ciber)
        ingredients.add(kokos)
        ingredients.add(eteris)
        answer = findViewById(R.id.textViewb2)
        calculateButton!!.setOnClickListener { v: View? -> calculatePortion() }
    }
}