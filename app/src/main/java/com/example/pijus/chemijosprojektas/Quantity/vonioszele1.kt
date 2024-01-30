package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class vonioszele1 : BaseQuantityActivity() {
    var vanduo = 12.0
    var sampunas = 12.0
    var zelatina = 1.4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vonioszele1)
        recipe = "Darbo eiga: \n" +
                "1. Į užvirintą vandenį supilti želatiną ir ją ištirpinti. \n" +
                "2. Įmaišykite šampūną. \n" +
                "3. Atvėsinkite gautą masę. \n" +
                "4. Sustingusią masę galima naudoti prausimuisi."

        ingredientText.add(" ml vandens")
        ingredientText.add(" ml šampūno")
        ingredientText.add(" g želatinos")
        ingredients.add(vanduo)
        ingredients.add(sampunas)
        ingredients.add(zelatina)

        calculateResults = findViewById(R.id.skaiciuoti)
        input = findViewById(R.id.ivestis)
        results.add(findViewById(R.id.rezultatas))
        results.add(findViewById(R.id.rezultatas2))
        results.add(findViewById(R.id.rezultatas3))
        recipeView = findViewById(R.id.receptasv)
        calculateResults!!.setOnClickListener { calculateButton() }
    }
}