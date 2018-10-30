package com.originalstocks.bottomcentrecurve

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bottom_app_bar.replaceMenu(R.menu.bottom_menu)
        val view = LayoutInflater.from(this).inflate(R.layout.bottom_layout, null, false);
        bottom_app_bar.addView(view)
        fab_button.setOnClickListener {
            Toast.makeText(this, "Cooool", Toast.LENGTH_SHORT).show()
        }

        business.setOnClickListener{Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show()}
        media.setOnClickListener{Toast.makeText(this, "Favourites Clicked", Toast.LENGTH_SHORT).show()}
        sports.setOnClickListener{Toast.makeText(this, "Bookings Clicked", Toast.LENGTH_SHORT).show()}
        tech.setOnClickListener{Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show()}
    }
}
