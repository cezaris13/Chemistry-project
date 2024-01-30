package com.example.pijus.chemijosprojektas.PossibleAmount

import android.os.Bundle
import android.view.View
import com.example.pijus.chemijosprojektas.R

class balzamas2 : BaseCalculatePortionsActivity() {
    var alyvos = 23.0
    var vaskas = 17.0
    var medus = 6.0
    var vandekas = 0.05
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balzamas2)
        calculateButton = findViewById(R.id.buttonba3)
        editTexts.add(findViewById(R.id.ivestisba1))
        editTexts.add(findViewById(R.id.ivestisba2))
        editTexts.add(findViewById(R.id.ivestisba3))
        editTexts.add(findViewById(R.id.ivestisba4))
        ingredients.add(alyvos)
        ingredients.add(vaskas)
        ingredients.add(medus)
        ingredients.add(vandekas)
        answer = findViewById(R.id.textViewba2)
        calculateButton!!.setOnClickListener { v: View? -> calculatePortion() }
    }
}