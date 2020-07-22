package com.example.recetas.ui.tab

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import com.example.recetas.R
import com.example.recetas.ui.tab.favorites.FavoritesFragment
import com.example.recetas.ui.tab.search.ingredients.SearchFragment
import com.example.recetas.model.TabItem.*


// Base class for search and favorites activities
open class TabActivity: AppCompatActivity() {

    var searchTabFragment: Fragment = SearchFragment.newInstance()
    var favoritesTabFragment: Fragment = FavoritesFragment.newInstance()
    lateinit var tabLayout: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout = findViewById(R.id.tabs)
        tabLayout.addOnTabSelectedListener(TabListener())

        switchToFragment()
    }

    open fun switchToFragment(fragment: androidx.fragment.app.Fragment = searchTabFragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }

    inner class TabListener: TabLayout.OnTabSelectedListener {

        override fun onTabSelected(tab: TabLayout.Tab) {

            val fragment = when (if (SEARCH.ordinal== tab.position) SEARCH else FAVORITES) {
                SEARCH -> searchTabFragment
                FAVORITES -> favoritesTabFragment
            }

            switchToFragment(fragment)

        }

        override fun onTabUnselected(tab: TabLayout.Tab) {}

        override fun onTabReselected(tab: TabLayout.Tab) {}

    }
}