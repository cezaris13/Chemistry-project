package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class avizos1 : BaseQuantityActivity() {
    var dribsniai = 6.0
    var miltai = 5.0
    var vendens = 1.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avizos1)
        recipe = "Darbo eiga: \n" +
                "1. Nusivalykite veido odą. \n" +
                "2. Indelyje sumaišykite dribsnius su soda.\n" +
                "3. Įpilkite drungno vandens, kad gautumėte pastą. \n" +
                "4. Švelniai trinkite veidą. \n" +
                "5. Nusiprauskite ir nusausinkite."

        ingredientText.add(" g avižinių dribsnių")
        ingredientText.add(" g kepimo miltelių")
        ingredientText.add(" ml vandens")
        ingredients.add(dribsniai)
        ingredients.add(miltai)
        ingredients.add(vendens)

        calculateResults = findViewById(R.id.skaiciuotia)
        input = findViewById(R.id.ivestisa)
        results.add(findViewById(R.id.rezultatasa))
        results.add(findViewById(R.id.rezultatasa2))
        results.add(findViewById(R.id.rezultatasa3))
        calculateResults!!.setOnClickListener { calculateButton() }
    }
}