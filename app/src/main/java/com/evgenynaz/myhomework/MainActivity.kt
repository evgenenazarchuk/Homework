package com.evgenynaz.myhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.evgenynaz.myhomework.homework2.Autos
import com.evgenynaz.myhomework.homework3.Animal
import com.evgenynaz.myhomework.homework3.Dog
import com.evgenynaz.myhomework.homework3.Elephant
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Autos.editAuto()
        val dog = Dog("Mike", 50.5)
        println("${dog.name}: пробежал за =    ${dog.resultTime()}  часа")
        val elephant = Elephant("Ololo", 13.2)
        println("${elephant.name}: пробежал за =   ${elephant.resultTime()}   часа")
    }
}