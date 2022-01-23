package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class FirstFragment : Fragment( R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val controller = Navigation.findNavController(view)

            val action=FirstFragmentDirections.actionFirstFragmentToSecondFragment()

            controller.navigate(action)
        }
}