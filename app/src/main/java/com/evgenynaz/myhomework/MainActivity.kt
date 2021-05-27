package com.evgenynaz.myhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.evgenynaz.myhomework.homework2.Autos
import com.evgenynaz.myhomework.homework3.Dog
import com.evgenynaz.myhomework.homework3.Elephant
import com.evgenynaz.myhomework.homework4.Chief
import com.evgenynaz.myhomework.homework4.Employee
import com.evgenynaz.myhomework.homework4.Manager
import com.evgenynaz.myhomework.homework4.Workers


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Autos.editAuto()
        val dog = Dog("Mike", 50.5)
        println("${dog.name}: пробежал за =    ${dog.resultTime()}  часа")
        val elephant = Elephant("Ololo", 13.2)
        println("${elephant.name}: пробежал за =   ${elephant.resultTime()}   часа")

        val victor = Workers("Виктор", 60.30)
        val timofei = Workers("Тимофей", 70.30)
        val sergei = Workers("Сергей", 30.5)
        val michail = Workers("Михайл", 30.5)
        val georgi = Workers("Георгий", 70.30)
        val yan = Workers("Ян", 70.30)
        val evgeni = Workers("Евгений", 70.20)
        val timofei2 = Workers("Тимофей", 70.10)
        val aleksandr = Workers("Александр", 73.10)
        val dmitrii = Workers("Дмитрий", 74.10)
        val fedor = Workers("Федор", 76.10)
        val arkadi = Workers("Аркадий", 78.10)
        val semenManager = Manager(
            "Семен", 1000.30, (arrayListOf(victor, timofei, sergei))
        )

        val valeriManager = Manager(
            "Валерий", 1000.50,
            (arrayListOf(michail, georgi, yan))
        )


        val timManager = Manager(
            "Тимофей", 1010.50, (arrayListOf(evgeni, timofei2, aleksandr))
        )

        val maksManager = Manager(
            "Максим", 1030.50, (arrayListOf(
                dmitrii, fedor, arkadi
            ))
        )

        val samChief =
            Chief(
                "Сэм", 1500.50,
                (arrayListOf(semenManager, valeriManager))
            )

        val jayChief =
            Chief(
                "Джейсон", 1600.50,
                (arrayListOf(timManager, maksManager))
            )
        val spis = arrayListOf(
            victor,
            timofei,
            sergei,
            michail,
            georgi,
            yan,
            evgeni,
            timofei2,
            aleksandr,
            dmitrii,
            fedor,
            arkadi,
            semenManager,
            valeriManager,
            timManager,
            maksManager,
            samChief,
            jayChief,
        )

        val spisok = spis.forEach {
            println("Name: ${it.nameEmployee}, salary: ${it.salary} $")
            when (it) {
                is Chief -> println("имеет ${it.managers.size} подчиненных")
                is Manager -> println("имеет ${it.workers.size} подчиненных")
                is Workers -> it.work()
            }
        }

    }
}