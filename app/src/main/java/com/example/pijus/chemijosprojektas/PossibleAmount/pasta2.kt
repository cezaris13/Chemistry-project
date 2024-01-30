package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class pasta2 : BaseCalculatePortionsActivity() {
    var milteliaii = 7.5
    var druskaa = 1.0
    var gliceroliss = 2.8
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasta2)
        calculateButton = findViewById(R.id.buttonp3)
        editTexts.add(findViewById(R.id.ivestisp1))
        editTexts.add(findViewById(R.id.ivestisp2))
        editTexts.add(findViewById(R.id.ivestisp3))

        ingredients.add(milteliaii)
        ingredients.add(druskaa)
        ingredients.add(gliceroliss)

        answer = findViewById(R.id.textViewp2)
        calculateButton!!.setOnClickListener { calculatePortion() }
    }
}