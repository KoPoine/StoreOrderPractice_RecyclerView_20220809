package com.neppplus.storeorderpractice_recyclerview_20220809

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext : Context = this

    abstract fun setupEvent()
    abstract fun setValues()

}