package com.example.kotlin.fragmentsandbox.Interaction

import android.os.Bundle
import android.support.v4.app.Fragment
import android.telecom.Call
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin.fragmentsandbox.R
import kotlinx.android.synthetic.main.fragment_input.*

class InputFragment : Fragment() {

    lateinit var callback: CallbackInterface

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_input, container, false)
    }

    override fun onStart() {
        super.onStart()
        // TODO: test - what will happen with nothing in edit text?
        display_input_btn.setOnClickListener {
            callback.displayText(text_input_editText.text.toString())
        }
    }
}