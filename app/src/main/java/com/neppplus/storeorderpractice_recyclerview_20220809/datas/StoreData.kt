package com.neppplus.storeorderpractice_recyclerview_20220809.datas

import java.io.Serializable

class StoreData(
    val title : String,
    val score : Double,
    val imageUri : String,
    val phoneNum : String,
    val siteUrl : String,
) : Serializable{
}