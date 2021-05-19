package com.evgenynaz.myhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.evgenynaz.myhomework.homework2.Auto
import com.evgenynaz.myhomework.homework2.Autos

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vv = Autos.editAuto()

        Auto()
    }
}