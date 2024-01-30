package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class losjonas1 : BaseQuantityActivity() {
    var aliejus = 22.0
    var vaskas = 12.0
    var lasas = 1.0
    var alavijo = 5.0
    var E = 1.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_losjonas1)
        calculateResults = findViewById(R.id.skaiciuotil)

        recipe = "Darbo eiga: \n" +
                "1. Aliejuje ištirpinti vašką. Neleisti užvirti.\n" +
                "2. Į šia masę pilti vitaminą E, eterinį aliejų ir alaviją. \n" +
                "3. Visą masę gerai išmaišyti. \n" +
                "4. Tepkite ant odos."

        ingredientText.add(" g aliejaus")
        ingredientText.add(" g bičių vaško")
        ingredientText.add(" lašų eterinio aliejaus")
        ingredientText.add(" lašų alavijo")
        ingredientText.add(" tablečių vitamino E")
        ingredients.add(aliejus)
        ingredients.add(vaskas)
        ingredients.add(lasas)
        ingredients.add(alavijo)
        ingredients.add(E)
        input = findViewById(R.id.ivestisl)
        results.add(findViewById(R.id.rezultatasl))
        results.add(findViewById(R.id.rezultatasl2))
        results.add(findViewById(R.id.rezultatasl3))
        results.add(findViewById(R.id.rezultatasl4))
        results.add(findViewById(R.id.rezultatasl5))
        recipeView = findViewById(R.id.receptaslo)
        calculateResults!!.setOnClickListener { calculateButton() }
    }
}