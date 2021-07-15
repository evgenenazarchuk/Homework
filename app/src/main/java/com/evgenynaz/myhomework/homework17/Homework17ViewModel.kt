package com.evgenynaz.myhomework.homework17

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.evgenynaz.myhomework.homework17.data.Currency
import com.evgenynaz.myhomework.homework17.restApi.CurrencyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Homework17ViewModel(
        private val currencyRepository: CurrencyRepository
    ) : ViewModel() {

    val currenciesLiveData: MutableLiveData<MutableList<Currency>> = MutableLiveData()

    fun count () {
        viewModelScope.launch(Dispatchers.Main) {
            val currenciesList =
                currencyRepository.getCurrenciesList()
            currenciesLiveData.value = currenciesList
        }
    }
}

    class HomeWork17ViewModelFactory(
        private val currencyRepository: CurrencyRepository
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return Homework17ViewModel(currencyRepository) as T
        }
    }
