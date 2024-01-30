package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class vonioszele2 : BaseCalculatePortionsActivity() {
    var zelle = 12.0
    var vanduoo = 12.0
    var sampunass = (14 / 10).toDouble()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vonioszele2)
        calculateButton = findViewById(R.id.button3)
        editTexts.add(findViewById(R.id.ivestis1))
        editTexts.add(findViewById(R.id.ivestis2))
        editTexts.add(findViewById(R.id.ivestis3))
        answer = findViewById(R.id.textView2)
        ingredients.add(zelle)
        ingredients.add(vanduoo)
        ingredients.add(sampunass)
        calculateButton!!.setOnClickListener { calculatePortion() }
    }
}