package com.example.aplikasibuku


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_kembali.*

/**
 * A simple [Fragment] subclass.
 */
class PinjamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pinjam, container, false)
    }

    private fun pindah(){
        fabAddbuku.setOnClickListener{

        }
    }
}
