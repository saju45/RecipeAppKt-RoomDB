package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.adapter.MainCategoriesAdapter
import com.example.recipeapp.adapter.SubCategoriesAdapter
import com.example.recipeapp.entities.Recipies

class HomeActivity : AppCompatActivity() {

    var arrayMainCategory=ArrayList<Recipies>()
    var arraySubCategory=ArrayList<Recipies>()

    var mainCategoriesAdapter=MainCategoriesAdapter()
    var subCategoriesAdapter=SubCategoriesAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var mainRv=findViewById<RecyclerView>(R.id.rv_main_categories)
        var subRv=findViewById<RecyclerView>(R.id.rv_sub_categories)

        arrayMainCategory.add(Recipies(1,"Beef"))
        arrayMainCategory.add(Recipies(2,"Chicken"))
        arrayMainCategory.add(Recipies(3,"Food"))
        arrayMainCategory.add(Recipies(4,"Milk"))
        arrayMainCategory.add(Recipies(5,"Water"))
        arrayMainCategory.add(Recipies(6,"Egg"))

        mainCategoriesAdapter.setData(arrayMainCategory)
        mainRv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        mainRv.adapter=mainCategoriesAdapter

        arraySubCategory.add(Recipies(1,"Beef and mustard pie"))
        arraySubCategory.add(Recipies(2,"Chicken and mushroom hotpot"))
        arraySubCategory.add(Recipies(3,"Food"))
        arraySubCategory.add(Recipies(4,"Milk"))
        arraySubCategory.add(Recipies(5,"Water"))
        arraySubCategory.add(Recipies(6,"Egg"))

        subCategoriesAdapter.setData(arraySubCategory)
        subRv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        subRv.adapter=subCategoriesAdapter
    }
}