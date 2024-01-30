package com.example.pijus.chemijosprojektas.Quantity

import android.os.Bundle
import com.example.pijus.chemijosprojektas.R

class balzamas1 : BaseQuantityActivity() {
    var alyvos = 23.0
    var vaskas = 17.0
    var medus = 6.0
    var vandekas = 0.05
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balzamas1)

        recipe = "Darbo eiga: \n" + "1.Aliejuje ištirpinti vašką. Neleisti užvirti \n" +
                "2.Kai aliejus ir vaškas susimaišys, įmaišyti medų.\n" +
                "3. Įlašinti vitaminą E.\n" +
                "4. Gautą mišinį palikti atvėsti.\n" +
                "5. Balzamą laikyti šaldytuve.\n" +
                "6. Naudoti tik sustingusį."

        ingredientText.add(" g alyvuogių aliejaus")
        ingredientText.add(" g bicčių vaško")
        ingredientText.add(" g želatinos")
        ingredientText.add(" ml vandens")
        ingredients.add(alyvos)
        ingredients.add(vaskas)
        ingredients.add(medus)
        ingredients.add(vandekas)

        calculateResults = findViewById(R.id.skaiciuotibal)
        input = findViewById(R.id.ivestisbal)
        results.add(findViewById(R.id.rezultatasbal))
        results.add(findViewById(R.id.rezultatasbal2))
        results.add(findViewById(R.id.rezultatasbal3))
        results.add(findViewById(R.id.rezultatasbal4))
        recipeView = findViewById(R.id.receptasbalzamas)
        calculateResults!!.setOnClickListener { calculateButton() }
    }
}