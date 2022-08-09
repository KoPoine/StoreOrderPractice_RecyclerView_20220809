package com.neppplus.storeorderpractice_recyclerview_20220809

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.neppplus.storeorderpractice_recyclerview_20220809.adapters.MainViewPagerAdapter
import com.neppplus.storeorderpractice_recyclerview_20220809.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var mPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvent()
        setValues()
    }

    override fun setupEvent() {

    }

    override fun setValues() {
        mPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        binding.mainViewPager.adapter = mPagerAdapter

        binding.mainTabLayout.setupWithViewPager(binding.mainViewPager)
    }
}