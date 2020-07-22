package com.example.recetas.recipes

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.recetas.model.RecipeModel


@Database(entities = [RecipeModel::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun recipesDao(): RecipesDao
}