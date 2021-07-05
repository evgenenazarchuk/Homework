package com.evgenynaz.myhomework.homework13

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evgenynaz.myhomework.homework10.Candy
import com.evgenynaz.myhomework.homework10.CandyView

class FragmentCandyCode : ViewModel() {

    val candyLiveData2: MutableLiveData<MutableList<Candy>> = MutableLiveData()

    init {
        getCandy()
    }

    private fun getCandy() {
        candyLiveData2.value = CandyView().candyView()
    }
}