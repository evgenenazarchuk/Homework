package com.evgenynaz.myhomework.homework2

class Auto(
    val model: String,
    var color: String = "white",
    val engine: Double,
    var number: String? = null,
) {

    fun getCar(): String {
        var auto: String =
            "Auto: model - $model, color - $color, engine - $engine, number - ${
                number ?: "Transit"
            }"
        return auto
    }


}
