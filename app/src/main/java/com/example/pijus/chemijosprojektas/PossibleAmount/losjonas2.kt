package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class losjonas2 : BaseCalculatePortionsActivity() {
    var aliejus = 22.0
    var vaskas = 12.0
    var lasas = 1.0
    var alavijo = 5.0
    var E = 1.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_losjonas2)
        calculateButton = findViewById(R.id.buttonl3)
        editTexts.add(findViewById(R.id.ivestisl1))
        editTexts.add(findViewById(R.id.ivestisl2))
        editTexts.add(findViewById(R.id.ivestisl3))
        editTexts.add(findViewById(R.id.ivestisl4))
        editTexts.add(findViewById(R.id.ivestisl5))
        ingredients.add(aliejus)
        ingredients.add(vaskas)
        ingredients.add(lasas)
        ingredients.add(alavijo)
        ingredients.add(E)

        answer = findViewById(R.id.textViewl2)
        calculateButton!!.setOnClickListener { calculatePortion() }
    }
}