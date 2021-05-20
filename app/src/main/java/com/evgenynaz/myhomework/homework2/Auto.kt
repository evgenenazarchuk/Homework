package com.evgenynaz.myhomework.homework2

class Auto(
    val model: String = "Volvo",
    var color: String = "black",
    val engine: Double = 3.0,
    var number: String? = null,
    )
{

    fun getCar(): String {
        var number = number ?: "Transit"
        var auto: String =
            "Auto: model - $model, color - $color, engine - $engine, number - $number"
        return auto
    }


}
