package com.ketechsoft.belediyemyanimda.ui

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.ketechsoft.belediyemyanimda.R
import com.ketechsoft.belediyemyanimda.R.id.*
import com.ketechsoft.belediyemyanimda.util.extReplaceTo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(main_toolbar)


        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            main_toolbar,
            R.string.openDrawer,
            R.string.closeDrawer
        )

        drawer_layout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        naw_niew.setNavigationItemSelectedListener(this)
        HomeFragment().extReplaceTo(R.id.fragment_container, supportFragmentManager)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            itemHome -> HomeFragment().extReplaceTo(
                R.id.fragment_container,
                supportFragmentManager
            )
            itemNewComplaint -> {
                startActivity(Intent(this, MapsActivity::class.java))
            }

            itemComplaint -> {
                ComplaintFragment().extReplaceTo(
                    R.id.fragment_container,
                    supportFragmentManager
                )
                main_toolbar.title = "Başvurularım"
            }
            itemProfile -> ProfileFragment().extReplaceTo(
                R.id.fragment_container,
                supportFragmentManager
            )
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) drawer_layout.closeDrawer(GravityCompat.START)
        else super.onBackPressed()
    }
}
