package com.example.recetas.ui.tab.search.recipedetails

import android.view.View
import android.widget.TextView
import com.example.recetas.R


class RecipeDetailsViewHolder(itemView: View): androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

    val ingredientDetail = itemView.findViewById<TextView>(R.id.ingredient_detail)
}