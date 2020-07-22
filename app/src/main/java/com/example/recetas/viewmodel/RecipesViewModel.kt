package com.example.recetas.viewmodel

import androidx.lifecycle.ViewModel;
import android.content.Context
import com.example.recetas.app.Injection
import com.example.recetas.model.RecipeModel
import com.example.recetas.recipes.RecipesHandler

import java.util.ArrayList

class RecipesViewModel : ViewModel() {
    private val recipesNetworkManager = Injection.provideRecipesNetworkManager()
    private val recipesDataManager = Injection.provideRecipesDataManager()

    fun getRecipes(ingredients: ArrayList<String>, callback: RecipesHandler)= recipesNetworkManager.getRecipes(ingredients, callback)

    fun getFavoritesRecipes(context: Context) = recipesDataManager.getRecipes(context)

    fun saveFavoriteRecipe(context: Context, model: RecipeModel) = recipesDataManager.saveRecipe(context, model)

    fun deleteFavoriteRecipe(context: Context, model: RecipeModel) = recipesDataManager.deleteRecipe(context, model)

}
