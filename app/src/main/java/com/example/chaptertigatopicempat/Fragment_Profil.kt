package com.example.chaptertigatopicempat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment__profil.*


class Fragment_Profil : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__profil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var namaUser = arguments?.getString("DataUser")
        NamaProfil.text = "$namaUser"

        btnkeluar.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment_Profil2_to_fragmentDua)
        }
    }

}