package com.evgenynaz.myhomework.homework4

class Worker(nameEmployee: String, salary: Double) : Employee(nameEmployee, salary) {

    fun work() {
        println("$nameEmployee работает")
    }


}