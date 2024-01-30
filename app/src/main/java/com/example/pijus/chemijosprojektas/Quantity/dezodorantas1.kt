package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class dezodorantas1 : BaseQuantityActivity() {
    var soda = 2.0
    var krakmolas = 2.0
    var kokosai = 2.0
    var eter = 1.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dezodorantas1)

        recipe =
            "Darbo eiga: \n" + "Visas sudedamąsias dalys gerai išmaišyti, gautą masę sudėti į indą ir laikyti šaldytuve."

        ingredientText.add(" šaukštai sodos")
        ingredientText.add(" šaukštai krakmolo")
        ingredientText.add(" šaukštai kokosų aliejaus")
        ingredientText.add(" šaukštai eterinio aliejaus")
        ingredients.add(soda)
        ingredients.add(krakmolas)
        ingredients.add(kokosai)
        ingredients.add(eter)

        calculateResults = findViewById(R.id.skaiciuotid)
        input = findViewById(R.id.ivestisd)
        results.add(findViewById(R.id.rezultatasd))
        results.add(findViewById(R.id.rezultatasd2))
        results.add(findViewById(R.id.rezultatasd3))
        results.add(findViewById(R.id.rezultatasd4))
        recipeView = findViewById(R.id.receptasde)
        calculateResults!!.setOnClickListener { calculateButton() }
    }
}