package com.example.chaptertigatopicempat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_satu.*


class FragmentSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    btnPindah1.setOnClickListener {
        var dataUser = editNama.text.toString()
        var dataPass = editPassword.text.toString()
        var bund = Bundle()
        bund.putString("DataUser", dataUser)

        if(dataUser.equals("akbar Maulana") && dataPass.equals("123")){
            Toast.makeText(context, "Login Berhasil", Toast.LENGTH_LONG).show()
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentDua, bund)
        }else{
            Toast.makeText(context, "password dan username salah ", Toast.LENGTH_LONG).show()
        }
    }

    Registrasi.setOnClickListener {
        Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragment_Registrasi)
    }
    }
}