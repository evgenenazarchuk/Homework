package com.evgenynaz.myhomework.homework4

class Workers(nameEmployee: String, salary: Double) : Employee(nameEmployee, salary) {

    fun work() {
        println("$nameEmployee работает")
    }


}