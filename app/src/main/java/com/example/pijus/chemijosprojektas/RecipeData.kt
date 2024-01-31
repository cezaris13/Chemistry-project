package com.example.pijus.chemijosprojektas

class RecipeData(
    ingredients: List<Int>,
    ingredientsText: List<String>,
    placeHolderText: String,
    recipe: String
) {
    var ingredients: List<Int> = emptyList()
    var ingredientsText: List<String> = emptyList()
    var placeHolderText: String = ""
    var recipe: String = ""

    init {
        this.ingredients = ingredients
        this.ingredientsText = ingredientsText
        this.placeHolderText = placeHolderText
        this.recipe = recipe
    }
}