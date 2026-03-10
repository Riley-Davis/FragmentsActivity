package edu.temple.fragmentsactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.toColorInt


class ColorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false).apply{
            setOnClickListener {
                setBackgroundColor(
                    arrayOf("red","blue","green","black","white","gray","cyan","magenta","yellow","lightgray","darkgray","gray","aqua","fuchsia","lime","maroon","navy","olive","purple","silver","teal").random().toColorInt())

            }
        }
    }



}