package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class pasta1 : BaseQuantityActivity() {
    var milteliai = 7.5
    var druska = 1.0
    var glizerolis = 1.8
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasta1)
        calculateResults = findViewById(R.id.skaiciuotip)

        recipe = " Darbo eiga: \n" +
                "1. Sumašykite miltelius ir druską. \n" +
                "2. Supilkite glicerolį. \n" +
                "3. Pilkite iš lėto vandenį, kol gausite tinkamos konsistencijos masę."

        ingredientText.add(" g kepimo miltelių")
        ingredientText.add(" g druskos")
        ingredientText.add(" ml glicerolio")
        ingredients.add(milteliai)
        ingredients.add(druska)
        ingredients.add(glizerolis)

        input = findViewById(R.id.ivestisp)
        results.add(findViewById(R.id.rezultatasp))
        results.add(findViewById(R.id.rezultatasp2))
        results.add(findViewById(R.id.rezultatasp3))
        recipeView = findViewById(R.id.receptaspp)
        calculateResults!!.setOnClickListener { calculateButton() }
    }
}