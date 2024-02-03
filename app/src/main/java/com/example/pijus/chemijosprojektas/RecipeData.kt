package com.example.pijus.chemijosprojektas

class RecipeData(
    ingredients: List<Double>,
    ingredientsText: List<String>,
    ingredientsHintText: List<String>,
    placeHolderText: String,
    recipe: String
) {
    var ingredients: List<Double> = emptyList()
    var ingredientsText: List<String> = emptyList()
    var ingredientsHintText: List<String> = emptyList()
    var placeHolderText: String = ""
    var recipe: String = ""

    init {
        this.ingredients = ingredients
        this.ingredientsText = ingredientsText
        this.ingredientsHintText = ingredientsHintText
        this.placeHolderText = placeHolderText
        this.recipe = recipe
    }
}