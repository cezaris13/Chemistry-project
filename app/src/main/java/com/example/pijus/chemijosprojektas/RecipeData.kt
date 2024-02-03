package com.example.pijus.chemijosprojektas

data class RecipeData(
    var ingredients: List<Double> = emptyList(),
    var ingredientsText: List<String> = emptyList(),
    var ingredientsHintText: List<String> = emptyList(),
    var placeHolderText: String = "",
    var recipe: String = ""
) {}