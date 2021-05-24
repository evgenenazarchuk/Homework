package com.evgenynaz.myhomework.homework3

import java.math.BigDecimal
import java.util.*

open class Animal (val speed:Double) {
    companion object {
        const val DISTANCE = 1080
    }
    fun resultTime(): String {
        return (String.format("%.3f", (DISTANCE / speed) / 3600))
    }
}








