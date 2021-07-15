package com.evgenynaz.myhomework.homework17.restApi

import com.evgenynaz.myhomework.homework17.data.Currency
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CurrencyRepository(
    private val currencyApi: CurrencyApi
) {


    suspend fun getCurrenciesList(): MutableList<Currency> = withContext(Dispatchers.IO) {
        currencyApi.getCurrencyList().data.map {
            Currency(id = it.id, name = it.name, sign = it.sign)

        }
    } as MutableList<Currency>
}
