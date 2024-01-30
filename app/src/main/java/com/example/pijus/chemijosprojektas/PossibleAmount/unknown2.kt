package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class unknown2 : BaseCalculatePortionsActivity() {
    var mltai = 15.0
    var druska = 5.6
    var vanduoooo = 8.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unknown2)
        calculateButton = findViewById(R.id.buttonu3)
        editTexts.add(findViewById(R.id.ivestisu1))
        editTexts.add(findViewById(R.id.ivestisu2))
        editTexts.add(findViewById(R.id.ivestisu3))
        ingredients.add(mltai)
        ingredients.add(druska)
        ingredients.add(vanduoooo)
        answer = findViewById(R.id.textViewu2)
        calculateButton!!.setOnClickListener { calculatePortion() }
    }
}