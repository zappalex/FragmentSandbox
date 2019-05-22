package com.example.kotlin.fragmentsandbox.Static

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import com.example.kotlin.fragmentsandbox.R

import kotlinx.android.synthetic.main.activity_static_fragment.*

/*
    Add Fragment Statically
    https://www.youtube.com/watch?v=I7yu-5PoteE&list=PLfuE3hOAeWhZDH-wHD0BJsJl7PpEW-wN8&index=2
 */

class StaticFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_fragment)
    }

}
