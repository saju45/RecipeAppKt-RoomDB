package com.example.recipeapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.recipeapp.entities.Recipies

@Dao
interface RecipeDao {

    @get:Query("select * from Recipes order by id desc")
    val allRecipes:List<Recipies>

    @Insert()
    fun insertRecipe(recipe:Recipies)

}