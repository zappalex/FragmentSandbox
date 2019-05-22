package com.example.kotlin.fragmentsandbox.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.fragmentsandbox.R
import kotlinx.android.synthetic.main.activity_dynamic_fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setStaticFragmentOnClick()
        setDynamicFragmentOnClick()
    }

    fun setStaticFragmentOnClick() {
        static_fragment_btn.setOnClickListener {
            val intent = Intent(this, StaticFragmentActivity::class.java)
            startActivity(intent)
        }
    }

    fun setDynamicFragmentOnClick() {
        dynamic_fragment_btn.setOnClickListener {
            val intent = Intent(this, DynamicFragmentActivity::class.java)
            startActivity(intent)
        }
    }
}
