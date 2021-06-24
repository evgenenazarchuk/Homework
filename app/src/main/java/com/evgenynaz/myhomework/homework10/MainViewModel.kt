package com.evgenynaz.myhomework.homework10

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val candyLiveData: MutableLiveData<MutableList<Candy>> = MutableLiveData()

    init {
        getCandyList()
    }

    private fun getCandyList() {
        candyLiveData.value = candyView()
    }

    override fun onCleared() {
        super.onCleared()
    }

}



