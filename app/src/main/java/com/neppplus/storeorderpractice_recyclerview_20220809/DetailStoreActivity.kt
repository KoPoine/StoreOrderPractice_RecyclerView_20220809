package com.neppplus.storeorderpractice_recyclerview_20220809

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.neppplus.storeorderpractice_recyclerview_20220809.databinding.ActivityDetailStoreBinding
import com.neppplus.storeorderpractice_recyclerview_20220809.datas.StoreData

class DetailStoreActivity : BaseActivity() {

    lateinit var binding : ActivityDetailStoreBinding
    lateinit var storeData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_store)
        setupEvent()
        setValues()
    }

    override fun setupEvent() {

    }

    override fun setValues() {
        storeData = intent.getSerializableExtra("storeData") as StoreData

        Glide.with(mContext)
            .load(storeData.imageUri)
            .into(binding.storeImg)
        binding.titleTxt.text = storeData.title
        binding.scoreTxt.text = "(${storeData.score})"
        binding.scoreRatingBar.rating = storeData.score.toFloat()
        binding.phoneNumTxt.text = storeData.phoneNum
        binding.homePageTxt.text = storeData.siteUrl
    }
}