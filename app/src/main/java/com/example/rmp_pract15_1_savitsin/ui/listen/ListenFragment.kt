package com.example.rmp_pract15_1_savitsin.ui.listen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.rmp_pract15_1_savitsin.R
import com.example.rmp_pract15_1_savitsin.databinding.FragmentListenBinding

class ListenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =  inflater.inflate(R.layout.fragment_listen, container, false)
        return root
    }
}