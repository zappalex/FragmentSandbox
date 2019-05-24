package com.example.kotlin.fragmentsandbox.Interaction

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.fragmentsandbox.R
import kotlinx.android.synthetic.main.fragment_display.*
import kotlinx.android.synthetic.main.fragment_input.*

/*
    Event Callbacks for Fragment Interaction
    https://www.youtube.com/watch?v=p2mXSHgNUgs

    - Activity should have awareness of all Fragments
    - Activity should perform add/remove/replace/actions
    - Fragments should be Modular
    - Fragments should not be aware of each other
    - Fragments should not launch other Fragments
 */

class FragmentInteractionActivity : AppCompatActivity(), CallbackInterface {

    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_interaction)
        addInputFragment()
    }

    fun addInputFragment() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = InputFragment()
        fragment.callback = this

        fragmentTransaction.add(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }

    fun addDisplayFragment(displayText: String) {
        val bundle = Bundle()
        bundle.putString("displayText", displayText)

        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = DisplayFragment()
        fragment.arguments = bundle

        fragmentTransaction.add(R.id.fragment_container, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    override fun displayText(text: String) {
        addDisplayFragment(text)
    }

}
