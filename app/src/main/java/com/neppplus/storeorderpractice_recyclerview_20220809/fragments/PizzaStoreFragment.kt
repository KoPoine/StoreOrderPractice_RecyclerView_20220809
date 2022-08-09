package com.neppplus.storeorderpractice_recyclerview_20220809.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.neppplus.storeorderpractice_recyclerview_20220809.R
import com.neppplus.storeorderpractice_recyclerview_20220809.databinding.FragmentPizzaStoreBinding

class PizzaStoreFragment : BaseFragment() {

    lateinit var binding : FragmentPizzaStoreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pizza_store, container, false)
        return binding.root
    }


    override fun setupEvents() {

    }

    override fun setValues() {

    }
}