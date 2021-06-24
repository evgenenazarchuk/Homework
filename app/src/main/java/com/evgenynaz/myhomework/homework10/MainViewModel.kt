package com.evgenynaz.myhomework.homework10

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    init {
        getCandyList()
    }

    val candyLiveData: MutableLiveData<MutableList<Candy>> = MutableLiveData()


    private fun getCandyList() {
        candyLiveData.value = candyView()
    }

    override fun onCleared() {
        super.onCleared()
    }

}



