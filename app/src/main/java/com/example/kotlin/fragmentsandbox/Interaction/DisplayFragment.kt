package com.example.kotlin.fragmentsandbox.Interaction

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin.fragmentsandbox.R
import kotlinx.android.synthetic.main.fragment_display.*

class DisplayFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_display, container, false)
    }

    override fun onStart() {
        super.onStart()

        val displayText = arguments?.getString("displayText")
        if (displayText != null) {
            display_text_view.text = displayText
        }

    }
}