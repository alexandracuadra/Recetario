package com.example.recetas.recipes



interface RecipeNetwork {
    fun getRecipes(ingredients: List<String>, callback: RecipesHandler)
}