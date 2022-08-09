package com.neppplus.storeorderpractice_recyclerview_20220809.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.storeorderpractice_recyclerview_20220809.fragments.PizzaStoreFragment
import com.neppplus.storeorderpractice_recyclerview_20220809.fragments.ProfileFragment

class MainViewPagerAdapter(
    fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PizzaStoreFragment()
            else -> ProfileFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "피자 주문"
            else -> "내 정보 수정"
        }
    }
}