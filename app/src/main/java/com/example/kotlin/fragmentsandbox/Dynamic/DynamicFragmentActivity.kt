package com.example.kotlin.fragmentsandbox.Dynamic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.fragmentsandbox.R

/*
    Add Fragment Dynamically
    https://www.youtube.com/watch?v=li12Kmvk7BQ&list=PLfuE3hOAeWhZDH-wHD0BJsJl7PpEW-wN8&index=3
 */

class DynamicFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment)
        addFragment()
    }

    fun addFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = DynamicFragment()

        fragmentTransaction.add(R.id.fragment_frame_layout, fragment)
        fragmentTransaction.commit()
    }

}
