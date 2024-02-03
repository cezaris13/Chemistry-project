package com.example.pijus.chemijosprojektas

class Recipes {
    companion object {
        fun getAllRecipes(): List<RecipeData> {
            val recipes: ArrayList<RecipeData> = ArrayList()
            recipes.add(getAvizos())
            recipes.add(getBalinamoji())
            recipes.add(getBalzamas())
            recipes.add(getDezodorantas())
            recipes.add(getKauke())
            recipes.add(getLosjonas())
            recipes.add(getPasta())
            recipes.add(getUnknown())
            recipes.add(getVoniosZele())
            return recipes
        }

        private fun getAvizos(): RecipeData {
            val recipe = "Darbo eiga: \n" +
                    "1. Nusivalykite veido odą. \n" +
                    "2. Indelyje sumaišykite dribsnius su soda.\n" +
                    "3. Įpilkite drungno vandens, kad gautumėte pastą. \n" +
                    "4. Švelniai trinkite veidą. \n" +
                    "5. Nusiprauskite ir nusausinkite."

            val ingredients = ArrayList<Double>()
            val ingredientText = ArrayList<String>()
            ingredientText.add(" g avižinių dribsnių")
            ingredientText.add(" g kepimo miltelių")
            ingredientText.add(" ml vandens")
            ingredients.add(6.0)
            ingredients.add(5.0)
            ingredients.add(1.0)

            val ingredientsHintText = ArrayList<String>()
            ingredientsHintText.add("Aviziniai dribsniai, g")
            ingredientsHintText.add("Kepimo milteliai, g")
            ingredientsHintText.add("Vanduo, ml")

            return RecipeData(ingredients, ingredientText, ingredientsHintText, "Įveskite kiekį", recipe)
        }

        private fun getBalinamoji(): RecipeData {
            val ingredients = ArrayList<Double>()
            val ingredientText = ArrayList<String>()
            val recipe =
                "Darbo eiga: \n" + "Viską sumaišyti ir valyti dantis 2-3 kartus per dieną.\n" +
                        "Kuo dažniau naudosite pastą, tuo greičiau pasieksite efektą."

            ingredientText.add(" arbatinių šaukštelių ciberžolės")
            ingredientText.add(" arbatinių šaukštelių kokosų aliejaus")
            ingredientText.add(" lašų metų eterinio aliejaus")
            ingredients.add(1.0)
            ingredients.add(1.0)
            ingredients.add(2.0)

            val ingredientsHintText = ArrayList<String>()
            ingredientsHintText.add("Ciberžolė, arbat. šaukšteliai")
            ingredientsHintText.add("Kokosų aliejus, atbat. šaukšteliai")
            ingredientsHintText.add("Eterinis aliejus, ml")

            return RecipeData(ingredients, ingredientText, ingredientsHintText, "Įveskite kiekį", recipe)
        }

        private fun getBalzamas(): RecipeData {
            val ingredients = ArrayList<Double>()
            val ingredientText = ArrayList<String>()
            val recipe = "Darbo eiga: \n" + "1. Aliejuje ištirpinti vašką. Neleisti užvirti \n" +
                    "2. Kai aliejus ir vaškas susimaišys, įmaišyti medų.\n" +
                    "3. Įlašinti vitaminą E.\n" +
                    "4. Gautą mišinį palikti atvėsti.\n" +
                    "5. Balzamą laikyti šaldytuve.\n" +
                    "6. Naudoti tik sustingusį."

            ingredientText.add(" g alyvuogių aliejaus")
            ingredientText.add(" g bicčių vaško")
            ingredientText.add(" g želatinos")
            ingredientText.add(" ml vandens")
            ingredients.add(23.0)
            ingredients.add(17.0)
            ingredients.add(6.0)
            ingredients.add(0.05)

            val ingredientsHintText = ArrayList<String>()
            ingredientsHintText.add("Alyvuogių aliejus, g")
            ingredientsHintText.add("Bičių vaškas, g")
            ingredientsHintText.add("Želatina, g")
            ingredientsHintText.add("Vanduo, ml")

            return RecipeData(ingredients, ingredientText, ingredientsHintText, "Įveskite kiekį", recipe)
        }

        private fun getDezodorantas(): RecipeData {
            val ingredients = ArrayList<Double>()
            val ingredientText = ArrayList<String>()
            val recipe =
                "Darbo eiga: \n" + "Visas sudedamąsias dalys gerai išmaišyti, gautą masę sudėti į indą ir laikyti šaldytuve."

            ingredientText.add(" šaukštai sodos")
            ingredientText.add(" šaukštai krakmolo")
            ingredientText.add(" šaukštai kokosų aliejaus")
            ingredientText.add(" šaukštai eterinio aliejaus")
            ingredients.add(2.0)
            ingredients.add(2.0)
            ingredients.add(2.0)
            ingredients.add(1.0)

            val ingredientsHintText = ArrayList<String>()
            ingredientsHintText.add("Soda, šaukštai")
            ingredientsHintText.add("Kokosų aliejus, šaukštai")
            ingredientsHintText.add("Krakmolas, šaukštai")
            ingredientsHintText.add("Eterinis aliejus, šaukštai")

            return RecipeData(ingredients, ingredientText, ingredientsHintText, "Įveskite kiekį", recipe)
        }

        private fun getKauke(): RecipeData {
            val ingredients = ArrayList<Double>()
            val ingredientText = ArrayList<String>()
            val recipe = " Darbo eiga: \n" +
                    "1. Indelyje maišykite mieles, actą ir vandenį, kol pasidarys tiršta masė. Jei reikia, įpilkite dar šiek tiek vandens, kad kaukę būtų galima tepti ant odos. \n" +
                    "2.Užtepkite kaukę ant odos. Palaikykite 10 – 15 min. \n" +
                    "3.Nuplaukite šiltu vandeniu ir nusausinkite."

            ingredientText.add(" g mielių")
            ingredientText.add(" šaukstelių vandens")
            ingredientText.add(" lašų acto")
            ingredients.add(5.5)
            ingredients.add(1.0)
            ingredients.add(1.5)

            val ingredientsHintText = ArrayList<String>()
            ingredientsHintText.add("Mielės, g")
            ingredientsHintText.add("Vanduo, šaukšteliai")
            ingredientsHintText.add("Actas, lašai")

            return RecipeData(ingredients, ingredientText, ingredientsHintText, "Įveskite kiekį", recipe)
        }

        private fun getLosjonas(): RecipeData {
            val ingredients = ArrayList<Double>()
            val ingredientText = ArrayList<String>()
            val recipe = "Darbo eiga: \n" +
                    "1. Aliejuje ištirpinti vašką. Neleisti užvirti.\n" +
                    "2. Į šia masę pilti vitaminą E, eterinį aliejų ir alaviją. \n" +
                    "3. Visą masę gerai išmaišyti. \n" +
                    "4. Tepkite ant odos."

            ingredientText.add(" g aliejaus")
            ingredientText.add(" g bičių vaško")
            ingredientText.add(" lašų eterinio aliejaus")
            ingredientText.add(" lašų alavijo")
            ingredientText.add(" tablečių vitamino E")
            ingredients.add(22.0)
            ingredients.add(12.0)
            ingredients.add(1.0)
            ingredients.add(5.0)
            ingredients.add(1.0)

            val ingredientsHintText = ArrayList<String>()
            ingredientsHintText.add("Aliejus, g")
            ingredientsHintText.add("Bičių vaškas, g")
            ingredientsHintText.add("Eterinis aliejus, lašai")
            ingredientsHintText.add("Alavijas, lašai")
            ingredientsHintText.add("Vitaminas E, tabletės")

            return RecipeData(ingredients, ingredientText, ingredientsHintText, "Įveskite kiekį", recipe)
        }

        private fun getPasta(): RecipeData {
            val ingredients = ArrayList<Double>()
            val ingredientText = ArrayList<String>()
            val recipe = " Darbo eiga: \n" +
                    "1. Sumašykite miltelius ir druską. \n" +
                    "2. Supilkite glicerolį. \n" +
                    "3. Pilkite iš lėto vandenį, kol gausite tinkamos konsistencijos masę."

            ingredientText.add(" g kepimo miltelių")
            ingredientText.add(" g druskos")
            ingredientText.add(" ml glicerolio")
            ingredients.add(7.5)
            ingredients.add(1.0)
            ingredients.add(1.8)

            val ingredientsHintText = ArrayList<String>()
            ingredientsHintText.add("Kepimo milteliai, g")
            ingredientsHintText.add("Druska, g")
            ingredientsHintText.add("Glicerolis, ml")

            return RecipeData(ingredients, ingredientText, ingredientsHintText, "Įveskite kiekį", recipe)
        }

        private fun getUnknown(): RecipeData {
            val ingredients = ArrayList<Double>()
            val ingredientText = ArrayList<String>()
            val recipe = "Darbo eiga: \n" +
                    "1. Iš sudėtinių dalių suminkykite tešlą. \n" +
                    "2. Gaminkite norimą skulptūrą."

            ingredientText.add(" g miltų")
            ingredientText.add(" g druskos")
            ingredientText.add(" ml vandens")
            ingredients.add(15.0)
            ingredients.add(5.6)
            ingredients.add(8.0)

            val ingredientsHintText = ArrayList<String>()
            ingredientsHintText.add("Miltai, g")
            ingredientsHintText.add("Vanduo, ml")
            ingredientsHintText.add("Druska, g")

            return RecipeData(ingredients, ingredientText, ingredientsHintText, "Įveskite kiekį", recipe)
        }

        private fun getVoniosZele(): RecipeData {
            val ingredients = ArrayList<Double>()
            val ingredientText = ArrayList<String>()
            val recipe = "Darbo eiga: \n" +
                    "1. Į užvirintą vandenį supilti želatiną ir ją ištirpinti. \n" +
                    "2. Įmaišykite šampūną. \n" +
                    "3. Atvėsinkite gautą masę. \n" +
                    "4. Sustingusią masę galima naudoti prausimuisi."

            ingredientText.add(" ml vandens")
            ingredientText.add(" ml šampūno")
            ingredientText.add(" g želatinos")
            ingredients.add(12.0)
            ingredients.add(12.0)
            ingredients.add(1.4)

            val ingredientsHintText = ArrayList<String>()
            ingredientsHintText.add("Žėlės kiekis, ml")
            ingredientsHintText.add("Šampūno kiekis, ml")
            ingredientsHintText.add("Želatinos kiekis, g")

            return RecipeData(ingredients, ingredientText, ingredientsHintText, "Įveskite kiekį", recipe)
        }
    }
}