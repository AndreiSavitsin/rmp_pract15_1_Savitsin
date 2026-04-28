package com.example.rmp_pract15_1_savitsin.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.rmp_pract15_1_savitsin.R
import com.example.rmp_pract15_1_savitsin.databinding.FragmentHomeBinding
import com.example.rmp_pract15_1_savitsin.recadapters.FeelRecycler
import com.example.rmp_pract15_1_savitsin.recadapters.MyFeel

class HomeFragment : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =  inflater.inflate(R.layout.fragment_home, container, false)
        val feel_recycler : RecyclerView = root.findViewById(R.id.feel_rec)
        feel_recycler.adapter = FeelRecycler(requireContext(),MyFeel().list)
        return root
    }
}