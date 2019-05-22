package com.example.kotlin.fragmentsandbox.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.fragmentsandbox.R
import com.example.kotlin.fragmentsandbox.fragments.LifecycleFragment

/*
    https://www.youtube.com/watch?v=GrPAVBOp_fk&list=PLfuE3hOAeWhZDH-wHD0BJsJl7PpEW-wN8&index=4

    - We can simulate normal functionality by adding the fragment at various points.
    - There are two main places that a fragment will be attached: onCreate, and during normal
      execution ( simulated here by adding in onResume )
 */

class LifecycleActivity : AppCompatActivity() {

    val TAG = "LifecycleActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        Log.d(TAG, "onCreate()")

        // enable for lifecycle that reflects adding fragment during activity creation
        //addFragment()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")

        // enable for lifecycle that reflects adding fragment during activity execution
        addFragment()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }

    fun addFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = LifecycleFragment()

        fragmentTransaction.add(R.id.fragment_frame_layout, fragment)
        fragmentTransaction.commit()
    }
}
