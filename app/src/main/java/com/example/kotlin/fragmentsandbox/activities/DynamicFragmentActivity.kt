package com.example.kotlin.fragmentsandbox.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.fragmentsandbox.R
import com.example.kotlin.fragmentsandbox.fragments.DynamicFragment

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
