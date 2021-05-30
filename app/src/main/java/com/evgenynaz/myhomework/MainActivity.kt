package com.evgenynaz.myhomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
//import com.evgenynaz.myhomework.homework2.Autos
import com.evgenynaz.myhomework.homework3.Dog
import com.evgenynaz.myhomework.homework3.Elephant
import com.evgenynaz.myhomework.homework4.Chief
import com.evgenynaz.myhomework.homework4.Manager
import com.evgenynaz.myhomework.homework4.Worker


class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        //Autos.editAuto()
        val dog = Dog("Mike", 50.5)
        println("${dog.name}: пробежал за =    ${dog.resultTime()}  часа")
        val elephant = Elephant("Ololo", 13.2)
        println("${elephant.name}: пробежал за =   ${elephant.resultTime()}   часа")

        val victor = Worker("Виктор", 60.30)
        val timofei = Worker("Тимофей", 70.30)
        val sergei = Worker("Сергей", 30.5)
        val michail = Worker("Михайл", 30.5)
        val georgi = Worker("Георгий", 70.30)
        val yan = Worker("Ян", 70.30)
        val evgeni = Worker("Евгений", 70.20)
        val timofei2 = Worker("Тимофей", 70.10)
        val aleksandr = Worker("Александр", 73.10)
        val dmitrii = Worker("Дмитрий", 74.10)
        val fedor = Worker("Федор", 76.10)
        val arkadi = Worker("Аркадий", 78.10)
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

        fun display() {
            spis.forEach {
                println("Имя сотрудника: ${it.nameEmployee}, Заработная плата: ${it.salary}")
                when (it) {
                    is Chief -> println("У начальника, есть такое количество менеджеров: ${it.managers.size} ")
                    is Manager -> println("У менеждера , есть такое количество рабочих: ${it.workers.size}")
                    is Worker -> it.work()
                }
            }
        }
        display()

    }


}


