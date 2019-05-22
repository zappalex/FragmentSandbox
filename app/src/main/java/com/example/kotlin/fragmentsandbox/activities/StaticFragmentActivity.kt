package com.example.kotlin.fragmentsandbox.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import com.example.kotlin.fragmentsandbox.R

import kotlinx.android.synthetic.main.activity_static_fragment.*

class StaticFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_fragment)
    }

}
