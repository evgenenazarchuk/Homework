package com.evgenynaz.myhomework.homework17.restApi

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CurrencyService {

    private const val BASE_URL = "https://pro-api.coinmarketcap.com/"
    const val API_KEY = "4a3d95bb-27f0-4a23-82fd-f0ff92d09416"
    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(
            OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }).build()
        )
        .build()

    fun getCurrencyService(): CurrencyApi = getRetrofit().create(CurrencyApi::class.java)
}
