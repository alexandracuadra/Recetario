package com.example.recetas.recipes

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

import com.example.recetas.model.RecipeModel

@Dao
interface RecipesDao {
    @Query("SELECT * FROM recipemodel")
    fun getAll(): List<RecipeModel>

    @Insert
    fun insert(recipe: RecipeModel)

    @Delete
    fun delete(recipe: RecipeModel)
}