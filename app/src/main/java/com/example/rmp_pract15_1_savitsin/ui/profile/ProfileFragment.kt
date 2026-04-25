package com.example.rmp_pract15_1_savitsin.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.rmp_pract15_1_savitsin.R
import com.example.rmp_pract15_1_savitsin.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =  inflater.inflate(R.layout.fragment_profile, container, false)
        return root
    }
}