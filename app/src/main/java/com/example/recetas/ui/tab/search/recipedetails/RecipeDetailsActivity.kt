package com.example.recetas.ui.tab.search.recipedetails
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.recetas.model.RecipeModel
import com.example.recetas.model.TabItem
import com.example.recetas.ui.tab.TabActivity
import com.example.recetas.ui.tab.search.recipes.RecipesFragment


class RecipeDetailsActivity : TabActivity(), OnItemRemovedListener {

    override fun onCreate(savedInstanceState: Bundle?) {

        val fragment = RecipeDetailsFragment.newInstance()
        val recipe = intent.getParcelableExtra<RecipeModel>(RecipesFragment.INTENT_NAME)
        val tabItem = intent.getIntExtra(RecipesFragment.TAB_ITEM, 0)
        val args = Bundle()
        args.putParcelable(RecipesFragment.INTENT_NAME, recipe)
        args.putInt(RecipesFragment.TAB_ITEM, tabItem)
        fragment.arguments = args

        searchTabFragment = fragment

        super.onCreate(savedInstanceState)

        if (tabItem == TabItem.SEARCH.ordinal) {
            searchTabFragment = fragment
            tabLayout.getTabAt(0)?.select()
        } else {
            favoritesTabFragment = fragment
            tabLayout.getTabAt(1)?.select()
        }

    }

    override fun itemIsRemoved() {
        setResult(Activity.RESULT_OK)
        finish()
    }
}
