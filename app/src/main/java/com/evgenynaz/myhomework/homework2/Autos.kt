package com.evgenynaz.myhomework.homework2

object Autos {
    fun editAuto() {

        val autoOne = Auto("bmw", "white", 3.6, "ABCH-1")
        println(autoOne.getCar())
        val autoTwo = Auto("WV", "white", 3.0)
        println(autoTwo.getCar())
        val autoThree = Auto("smart", "blue", 1.2, "ABCH-4")
        println(autoThree.getCar())
        val autoFour = Auto("reno", "blue", 2.0)
        println(autoFour.getCar())
        val autoFive = Auto("pegeout", "green", 1.9, "ABCH-6")
        println(autoFive.getCar())
        val autoSix = Auto("kia", "blue", 2.0, "ABCH-10")
        println(autoSix.getCar())
    }
}