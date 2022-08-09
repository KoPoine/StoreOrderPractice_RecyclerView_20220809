package com.neppplus.storeorderpractice_recyclerview_20220809.fragments

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    val mContext = requireContext()

    abstract fun setupEvents()
    abstract fun setValues()
}