package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class kauke2 : BaseCalculatePortionsActivity() {
    var mieless = 5.5
    var vanduoo = 1.0
    var actass = 1.5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kauke2)
        calculateButton = findViewById(R.id.buttonk3)
        editTexts.add(findViewById(R.id.ivestisk1))
        editTexts.add(findViewById(R.id.ivestisk2))
        editTexts.add(findViewById(R.id.ivestisk3))
        ingredients.add(mieless)
        ingredients.add(vanduoo)
        ingredients.add(actass)
        answer = findViewById(R.id.textViewk2)
        calculateButton!!.setOnClickListener { calculatePortion() }
    }
}