package com.example.fragmentstask

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.switchToFirstButton)
        button.setOnClickListener {
            (requireActivity() as MainActivity).switchToFirstFragment()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SecondFragment()
    }
}