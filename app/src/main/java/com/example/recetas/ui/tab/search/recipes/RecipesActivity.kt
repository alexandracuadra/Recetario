package com.example.recetas.ui.tab.search.recipes

import android.os.Bundle
import com.example.recetas.ui.tab.TabActivity


class RecipesActivity : TabActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val fragment = RecipesFragment.newInstance()
        val extras = intent.getStringArrayListExtra("INGREDIENTS_EXTRA")
        val args = Bundle()
        args.putStringArrayList("INGREDIENTS_EXTRA", extras)
        fragment.arguments =  args
        searchTabFragment = fragment

        super.onCreate(savedInstanceState)

    }

}
