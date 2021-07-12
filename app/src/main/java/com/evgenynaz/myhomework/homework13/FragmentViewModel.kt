package com.evgenynaz.myhomework.homework13

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evgenynaz.myhomework.homework10.Candy
import com.evgenynaz.myhomework.homework10.candyView


class FragmentViewModel : ViewModel() {

    val candyLiveData2: MutableLiveData<MutableList<Candy>> = MutableLiveData()

    init {
        this.getSweetsList()
    }

    private fun getSweetsList() {
        candyLiveData2.value = candyView()
    }
}