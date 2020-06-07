package com.example.shoppingcom

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.offer.R
import com.example.offer.ShopFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.shop.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onBottomNavigationSelectedItem()
    }

    private fun onBottomNavigationSelectedItem()
    {
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bnav1)
        bottomNavigation.setOnNavigationItemSelectedListener{ MenuItem->
            when(MenuItem.itemId)
            {
                R.id.shop->{

                    val fragment = ShopFragment(this,this as Activity);
                    val fragmentManager = supportFragmentManager
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.add(R.id.ff1,fragment)
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit()
                }
            }
            true
        }
    }

    override fun onBackPressed() {
        if (drawer1.isDrawerOpen(GravityCompat.START)) {
            drawer1.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}