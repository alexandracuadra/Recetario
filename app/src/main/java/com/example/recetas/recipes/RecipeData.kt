package com.example.recetas.recipes

import android.content.Context
import com.example.recetas.model.RecipeModel


interface RecipeData {
    fun getRecipes(context: Context): List<RecipeModel>
    fun saveRecipe(context: Context, model: RecipeModel)
    fun deleteRecipe(context: Context, model: RecipeModel)
}