package com.evgenynaz.myhomework.homework2

open class Auto(
    val model: String,
    var color: String = "white",
    val engine: Double,
    var number: String? = null,
) {

    fun getCar(): String {
        return "Auto: model - $model, color - $color, engine - $engine, number - ${
            number ?: "Transit"
        }"
    }


}
