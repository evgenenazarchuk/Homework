package com.evgenynaz.myhomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.evgenynaz.myhomework.homework10.Homework10Activity
import com.evgenynaz.myhomework.homework13.Homework13Activity
import com.evgenynaz.myhomework.homework17.CurrencyActivity
import com.evgenynaz.myhomework.alarm.Homework18Activity
import com.evgenynaz.myhomework.homework12.Homework12Activity
import com.evgenynaz.myhomework.homework16.Homework16Activity
import com.evgenynaz.myhomework.homework6.Homework6Activity
import com.evgenynaz.myhomework.homework7.Homework7Activity


class MainActivity : AppCompatActivity() {

    private lateinit var homework6: Button
    private lateinit var homework7one: Button
    private lateinit var homework10: Button
    private lateinit var homework12: Button
    private lateinit var homework13: Button
    private lateinit var homework16: Button
    private lateinit var homework17: Button
    private lateinit var homework18: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homework6 = findViewById(R.id.button6_homework)
        homework6.setOnClickListener {

            val intent = Intent(this, Homework6Activity::class.java)
            startActivity(intent)
        }
        homework7one = findViewById(R.id.button7_homework)
        homework7one.setOnClickListener {
            val intent1 = Intent(this, Homework7Activity::class.java)
            startActivity(intent1)
        }
        homework10 = findViewById(R.id.button10_homework)
        homework10.setOnClickListener {
            val intent2 = Intent(this, Homework10Activity::class.java)
            startActivity(intent2)
        }
        homework12 = findViewById(R.id.button12_homework2)
        homework12.setOnClickListener {
            val intent3 = Intent(this, Homework12Activity::class.java)
            startActivity(intent3)
        }


        homework13 = findViewById(R.id.button13_homework)
        homework13.setOnClickListener {
            val intent4 = Intent(this, Homework13Activity::class.java)
            startActivity(intent4)
        }

        homework16 = findViewById(R.id.button16_homework2)
        homework16.setOnClickListener {
            val intent5 = Intent(this, Homework16Activity::class.java)
            startActivity(intent5)
        }

        homework17 = findViewById(R.id.button17_homework2)
        homework17.setOnClickListener {
            val intent6 = Intent(this, CurrencyActivity::class.java)
            startActivity(intent6)
        }
        homework18 = findViewById(R.id.button18_homework)
        homework18.setOnClickListener {
            val intent7 = Intent(this, Homework18Activity::class.java)
            startActivity(intent7)
        }
        /*//Autos.editAuto()
        val dog = Dog("Mike", 50.5)
        println("${dog.name}: ???????????????? ???? =    ${dog.resultTime()}  ????????")
        val elephant = Elephant("Ololo", 13.2)
        println("${elephant.name}: ???????????????? ???? =   ${elephant.resultTime()}   ????????")

        val victor = Worker("????????????", 60.30)
        val timofei = Worker("??????????????", 70.30)
        val sergei = Worker("????????????", 30.5)
        val michail = Worker("????????????", 30.5)
        val georgi = Worker("??????????????", 70.30)
        val yan = Worker("????", 70.30)
        val evgeni = Worker("??????????????", 70.20)
        val timofei2 = Worker("??????????????", 70.10)
        val aleksandr = Worker("??????????????????", 73.10)
        val dmitrii = Worker("??????????????", 74.10)
        val fedor = Worker("??????????", 76.10)
        val arkadi = Worker("??????????????", 78.10)
        val semenManager = Manager(
            "??????????", 1000.30, (arrayListOf(victor, timofei, sergei))
        )

        val valeriManager = Manager(
            "??????????????", 1000.50,
            (arrayListOf(michail, georgi, yan))
        )


        val timManager = Manager(
            "??????????????", 1010.50, (arrayListOf(evgeni, timofei2, aleksandr))
        )

        val maksManager = Manager(
            "????????????", 1030.50, (arrayListOf(
                dmitrii, fedor, arkadi
            ))
        )

        val samChief =
            Chief(
                "??????", 1500.50,
                (arrayListOf(semenManager, valeriManager))
            )

        val jayChief =
            Chief(
                "??????????????", 1600.50,
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
                println("?????? ????????????????????: ${it.nameEmployee}, ???????????????????? ??????????: ${it.salary}")
                when (it) {
                    is Chief -> println("?? ????????????????????, ???????? ?????????? ???????????????????? ????????????????????: ${it.managers.size} ")
                    is Manager -> println("?? ?????????????????? , ???????? ?????????? ???????????????????? ??????????????: ${it.workers.size}")
                    is Worker -> it.work()
                }
            }
        }
        display()*/

    }


}




