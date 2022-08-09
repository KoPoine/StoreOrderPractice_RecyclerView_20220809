package com.neppplus.storeorderpractice_recyclerview_20220809.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.neppplus.storeorderpractice_recyclerview_20220809.R
import com.neppplus.storeorderpractice_recyclerview_20220809.databinding.FragmentPizzaStoreBinding
import com.neppplus.storeorderpractice_recyclerview_20220809.datas.StoreData

class PizzaStoreFragment : BaseFragment() {

    lateinit var binding : FragmentPizzaStoreBinding

    val mList = ArrayList<StoreData>()

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
        mList.clear()

        mList.add(StoreData("피자헛", 4.2,
            "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg" , "1577-8080"))
        mList.add(StoreData("파파존스", 4.5,
            "http://mblogthumb-phinf.pstatic.net/20160530_116/ppanppane_14646177654870uGy9_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%281%29.png?type=w800", "1577-8080"))
        mList.add(StoreData("도미노피자", 3.8,
            "https://www.pngplay.com/wp-content/uploads/6/Dominos-Pizza-Logo-Background-PNG-Image.png", "1577-3082"))
        mList.add(StoreData("미스터피자", 3.0,
            "https://mblogthumb-phinf.pstatic.net/20160530_62/ppanppane_14646177047843NP3E_PNG/%B9%CC%BD%BA%C5%CD%C7%C7%C0%DA_%B7%CE%B0%ED_%283%29.png?type=w800", "1577-0077"))
    }
}