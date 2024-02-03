package com.example.pijus.chemijosprojektas.data

import kotlinx.serialization.Serializable

@Serializable
data class RecipeData(
    var name: String = "",
    var ingredients: List<Double> = emptyList(),
    var ingredientsText: List<String> = emptyList(),
    var ingredientsHintText: List<String> = emptyList(),
    var placeHolderText: String = "",
    var recipe: String = ""
)