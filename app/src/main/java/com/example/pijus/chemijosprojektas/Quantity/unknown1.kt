package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class unknown1 : BaseQuantityActivity() {
    var miltai = 15.0
    var druska = 5.6
    var vanduooo = 8.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unknown1)

        recipe = "Darbo eiga: \n" +
                "1. Iš sudėtinių dalių suminkykite tešlą. \n" +
                "2. Gaminkite norimą skulptūrą."

        ingredientText.add(" g miltų")
        ingredientText.add(" g druskos")
        ingredientText.add(" ml vandens")
        ingredients.add(miltai)
        ingredients.add(druska)
        ingredients.add(vanduooo)
        calculateResults = findViewById(R.id.skaiciuotiu)
        input = findViewById(R.id.ivestisu)
        results.add(findViewById(R.id.rezultatasu))
        results.add(findViewById(R.id.rezultatasu2))
        results.add(findViewById(R.id.rezultatasu3))
        recipeView = findViewById(R.id.receptasun)
        calculateResults!!.setOnClickListener { calculateButton() }
    }
}