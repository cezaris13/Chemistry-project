package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class dezodorantas2 : BaseCalculatePortionsActivity() {
    var soda = 2.0
    var krakmolas = 2.0
    var kokosai = 2.0
    var eter = 1.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dezodorantas2)
        calculateButton = findViewById(R.id.buttond3)
        editTexts.add(findViewById(R.id.ivestisd1))
        editTexts.add(findViewById(R.id.ivestisd2))
        editTexts.add(findViewById(R.id.ivestisd3))
        editTexts.add(findViewById(R.id.ivestisd4))
        ingredients.add(soda)
        ingredients.add(krakmolas)
        ingredients.add(kokosai)
        ingredients.add(eter)
        answer = findViewById(R.id.textViewd2)
        calculateButton!!.setOnClickListener { calculatePortion() }
    }
}