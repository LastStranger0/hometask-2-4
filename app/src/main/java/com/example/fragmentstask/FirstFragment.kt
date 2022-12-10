package com.example.fragmentstask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.switchButton)
        button.setOnClickListener {
            (requireActivity() as MainActivity).switchToSecondFragment()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            FirstFragment()
    }
}