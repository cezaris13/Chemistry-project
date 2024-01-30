package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class kauke1 : BaseQuantityActivity() {
    var mieless = 5.5
    var vanduoo = 1.0
    var actass = 1.5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kauke1)
        recipe = " Darbo eiga: \n" +
                "1. Indelyje maišykite mieles, actą ir vandenį, kol pasidarys tiršta masė. Jei reikia, įpilkite dar šiek tiek vandens, kad kaukę būtų galima tepti ant odos. \n" +
                "2.Užtepkite kaukę ant odos. Palaikykite 10 – 15 min. \n" +
                "3.Nuplaukite šiltu vandeniu ir nusausinkite."

        ingredientText.add(" g mielių")
        ingredientText.add(" šaukstelių vandens")
        ingredientText.add(" lašų acto")
        ingredients.add(mieless)
        ingredients.add(vanduoo)
        ingredients.add(actass)

        calculateResults = findViewById(R.id.skaiciuotik)
        input = findViewById(R.id.ivestisk)
        results.add(findViewById(R.id.rezultatask))
        results.add(findViewById(R.id.rezultatask2))
        results.add(findViewById(R.id.rezultatask3))
        recipeView = findViewById(R.id.receptaska)
        calculateResults!!.setOnClickListener { calculateButton() }
    }
}