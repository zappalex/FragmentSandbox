package com.example.kotlin.fragmentsandbox

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.fragmentsandbox.Dynamic.DynamicFragmentActivity
import com.example.kotlin.fragmentsandbox.Lifecycle.LifecycleActivity
import com.example.kotlin.fragmentsandbox.Static.StaticFragmentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setStaticFragmentOnClick()
        setDynamicFragmentOnClick()
        setLifecycleFragmentOnClick()
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

    fun setLifecycleFragmentOnClick() {
        lifecycle_fragment_btn.setOnClickListener {
            val intent = Intent(this, LifecycleActivity::class.java)
            startActivity(intent)
        }
    }
}
