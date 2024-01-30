package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class balinamoji1 : BaseQuantityActivity() {
    var ciber = 1.0
    var kokos = 1.0
    var eteris = 2.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balinamoji1)
        recipe = "Darbo eiga: \n" + "Viską sumaišyti ir valyti dantis 2-3 kartus per dieną.\n" +
                "Kuo dažniau naudosite pastą, tuo greičiau pasieksite efektą."

        ingredientText.add(" arbatinių šaukštelių ciberžolės")
        ingredientText.add(" arbatinių šaukštelių kokosų aliejaus")
        ingredientText.add(" lašų metų eterinio aliejaus")
        ingredients.add(ciber)
        ingredients.add(kokos)
        ingredients.add(eteris)

        calculateResults = findViewById(R.id.skaiciuotib)
        input = findViewById(R.id.ivestisb)
        results.add(findViewById(R.id.rezultatasb))
        results.add(findViewById(R.id.rezultatasb2))
        results.add(findViewById(R.id.rezultatasb3))
        recipeView = findViewById(R.id.receptasbalinamoji)
        calculateResults!!.setOnClickListener { calculateButton() }
    }
}