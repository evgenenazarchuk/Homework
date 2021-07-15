package com.evgenynaz.myhomework.homework17.restApi

import com.evgenynaz.myhomework.BuildConfig
import com.evgenynaz.myhomework.homework17.entities.CurrencyResponce
import com.evgenynaz.myhomework.homework17.restApi.CurrencyService.API_KEY
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyApi {
    @Headers("X-CMC_PRO_API_KEY: ${API_KEY}")
    @GET("v1/fiat/map")
    suspend fun getCurrencyList(): CurrencyResponce
}
