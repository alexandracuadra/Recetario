package com.example.recetas.model

import android.view.View

interface RecyclerViewClickListener {
    fun recyclerViewListClicked(v: View, position: Int)
}