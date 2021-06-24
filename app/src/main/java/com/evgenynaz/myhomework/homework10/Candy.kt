package com.evgenynaz.myhomework.homework10

class Candy(
    val brand: Brand,
    val barcodeNumber: Int
)

const val NUMBER_CANDY = 300


fun candyView(): MutableList<Candy> {

    var candyList = mutableListOf<Candy>()

    for (i in 1..NUMBER_CANDY) {
        if (i <= 100) {
            candyList.add(
                Candy(Brand.MARS, barcodeNumber())
            )
        } else if (i in 101..200) {
            candyList.add(
                Candy(Brand.BOUNTY, barcodeNumber())
            )
        } else if (i in 201..300) {
            candyList.add(
                Candy(Brand.SNICKERS, barcodeNumber())
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


