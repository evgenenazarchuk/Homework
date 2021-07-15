package com.evgenynaz.myhomework.homework17.entities

import com.google.gson.annotations.SerializedName

data class CurrencyResponce(
    @SerializedName("data") val data: MutableList<СurrencyResponce1>,
    @SerializedName("status") val status: Status,
)