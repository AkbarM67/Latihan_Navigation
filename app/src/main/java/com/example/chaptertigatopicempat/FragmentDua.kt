package com.example.chaptertigatopicempat

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_dua.*
import kotlinx.android.synthetic.main.fragment_dua.TextNama
import kotlinx.android.synthetic.main.fragment_satu.*
import kotlinx.android.synthetic.main.fragment_tiga.*


class FragmentDua : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // mengambil data username
        var nameUser = arguments?.getString("DataUser")
        TextNama.text = "halo, $nameUser"

        btnHitung.setOnClickListener {
            var bund =Bundle()
            bund.putString("nameUser", nameUser)
            bund.putString("DataUmur", editDate.text.toString())

            Navigation.findNavController(view).navigate(R.id.action_fragmentDua_to_fragmentTiga, bund)
        }

        Profil.setOnClickListener {
            var bund = Bundle()
            bund.putString("DataUser", nameUser)
            Navigation.findNavController(view).navigate(R.id.action_fragmentDua_to_fragment_Profil2, bund)
        }
    }

}