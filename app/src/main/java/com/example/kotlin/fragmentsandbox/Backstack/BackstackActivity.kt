package com.example.kotlin.fragmentsandbox.Backstack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.fragmentsandbox.R
import kotlinx.android.synthetic.main.activity_backstack.*

/*
 */

class BackstackActivity : AppCompatActivity() {

    val TAG = "BackstackActivity"
    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backstack)
        Log.d(TAG, "onCreate()")

        val fragmentManager = supportFragmentManager

        fragmentManager.addOnBackStackChangedListener {
            fragment_count_tv.setText(fragmentManager.backStackEntryCount.toString())
        }

        add_fragment_backstack_btn.setOnClickListener {
            addFragmentToBackstack()
        }

        add_fragment_btn.setOnClickListener {
            addFragmentNoBackstack()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")
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

    fun addFragmentToBackstack() {

        // This must be created each time we use a commit as below, otherwise we'll get an exception
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = BackstackFragment()

        // Adding fragment and adding it to backstack here will build up backstack. Unless overridden, back will remove fragment.
        fragmentTransaction.add(R.id.fragment_frame_layout, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun addFragmentNoBackstack() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = BackstackFragment()


        // Without backstack, we cannot add multiple fragments in a row.  We must remove + add, or replace
        fragmentTransaction.add(R.id.fragment_frame_layout, fragment)
        fragmentTransaction.commit()
    }
}
