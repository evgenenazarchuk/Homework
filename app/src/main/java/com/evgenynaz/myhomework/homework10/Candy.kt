package com.evgenynaz.myhomework.homework10

data class Candy(
    val brand: String,
    val barcodeNumber: Int
)

internal fun candyView(): MutableList<Candy> {

    var candyList = mutableListOf<Candy>()
    for (i in 1..300) {
        if (i <= 100) {
            candyList.add(
                Candy
                    ("Snikers",barcodeNumber())
            )
        } else if (i in 101..200) {
            candyList.add(
                Candy
                    ("Mars", barcodeNumber())
            )
        } else if (i in 201..300) {
            candyList.add(
                Candy
                    ("Shock", barcodeNumber())
            )
        } else {
            println("Сорри конфеты закончились")
        }

    }
    return candyList
}

private fun barcodeNumber(): Int {
    return (10000000..99999999).random()
}
