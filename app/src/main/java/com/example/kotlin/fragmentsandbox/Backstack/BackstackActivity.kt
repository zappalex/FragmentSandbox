package com.example.kotlin.fragmentsandbox.Backstack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.fragmentsandbox.R
import kotlinx.android.synthetic.main.activity_backstack.*

/*
    Explore Fragment Backstack, and Add / Remove / Replace
    https://www.youtube.com/watch?v=EzUl88tzxH0&list=PLfuE3hOAeWhZDH-wHD0BJsJl7PpEW-wN8&index=5
    https://www.youtube.com/watch?v=SNSjzH_gyK8&list=PLfuE3hOAeWhZDH-wHD0BJsJl7PpEW-wN8&index=6
 */

class BackstackActivity : AppCompatActivity() {
    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backstack)

        val fragmentManager = supportFragmentManager

        fragmentManager.addOnBackStackChangedListener {
            fragment_count_tv.setText(fragmentManager.backStackEntryCount.toString())
        }

        add_fragment_backstack_btn.setOnClickListener {
            addFragmentToBackstack()
        }

        add_fragment_btn.setOnClickListener {
            addFragment()
        }

        add_alternate_fragment_btn.setOnClickListener {
            addAlternateFragment()
        }

        remove_fragment_btn.setOnClickListener {
            removeFragment()
        }

        replace_fragment_btn.setOnClickListener {
            replaceFragment()
        }

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

    // Add Fragment without backstack
    fun addFragment() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = BackstackFragment()

        // Without backstack, we cannot add multiple fragments in a row.  We must remove + add, or replace
        fragmentTransaction.add(R.id.fragment_frame_layout, fragment)
        fragmentTransaction.commit()
    }

    fun addAlternateFragment() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = AlternateBackstackFragment()

        fragmentTransaction.add(R.id.fragment_frame_layout, fragment)
        fragmentTransaction.commit()
    }

    fun removeFragment() {
        // When called without fragment, nothing will happen
        val fragment = fragmentManager.findFragmentById(R.id.fragment_frame_layout)
        if(fragment != null) {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragment)
            fragmentTransaction.commit()
        }
    }

    fun replaceFragment() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = AlternateBackstackFragment()

        // Without backstack, we cannot add multiple fragments in a row.  We must remove + add, or replace
        fragmentTransaction.replace(R.id.fragment_frame_layout, fragment)
        fragmentTransaction.commit()
    }
}
