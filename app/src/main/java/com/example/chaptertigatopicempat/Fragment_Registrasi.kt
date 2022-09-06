package com.example.chaptertigatopicempat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment__registrasi.*
import kotlinx.android.synthetic.main.fragment_satu.*


class Fragment_Registrasi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__registrasi, container, false)
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            btnRegistrasi.setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.action_fragment_Registrasi_to_fragmentSatu)
            }
    }
}
