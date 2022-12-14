package com.neppplus.storeorderpractice_recyclerview_20220809.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.neppplus.storeorderpractice_recyclerview_20220809.R
import com.neppplus.storeorderpractice_recyclerview_20220809.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment() {

    lateinit var binding : FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
        return binding.root
    }


    override fun setupEvents() {

    }

    override fun setValues() {

    }
}