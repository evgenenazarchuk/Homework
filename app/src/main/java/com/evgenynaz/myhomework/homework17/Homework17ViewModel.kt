package com.evgenynaz.myhomework.homework17

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.evgenynaz.myhomework.homework17.restApi.CurrencyRepository

class Homework17ViewModel(
        private val currencyRepository: CurrencyRepository
    ) : ViewModel() {


    class HomeWork17ViewModelFactory(
        private val currencyRepository: CurrencyRepository
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return Homework17ViewModel(currencyRepository) as T
        }
    }
}