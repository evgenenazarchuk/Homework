package com.evgenynaz.myhomework

import com.evgenynaz.myhomework.homework17.restApi.CurrencyRepository
import com.evgenynaz.myhomework.homework17.restApi.CurrencyService

class MySuperApp {
    val currencyRepository: CurrencyRepository by lazy {
        CurrencyRepository(CurrencyService.getCurrencyService())
    }
}