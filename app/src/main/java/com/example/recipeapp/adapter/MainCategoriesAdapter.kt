package com.example.recipeapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.R
import com.example.recipeapp.entities.Recipies

class MainCategoriesAdapter: RecyclerView.Adapter<MainCategoriesAdapter.RecipeViewHolder>() {

    var arrayMainCategories=ArrayList<Recipies>()
    class RecipeViewHolder (view: View):RecyclerView.ViewHolder(view){


    }
    fun setData(arrData: List<Recipies>){

        arrayMainCategories=arrData as ArrayList<Recipies>

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_main_categories,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        var name=holder.itemView.findViewById<TextView>(R.id.dishName)

        name.text=arrayMainCategories[position].dishName

    }

    override fun getItemCount(): Int {

        return arrayMainCategories.size
    }
}