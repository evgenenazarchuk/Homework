package com.evgenynaz.myhomework.homework7

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.evgenynaz.myhomework.R


class Homework71Activity:AppCompatActivity() {
    private lateinit var tvView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework71)
        tvView =  findViewById(R.id.tvView)
        val intent = intent

        val login = intent.getStringExtra("Login")
        val password = intent.getStringExtra("Password")

        tvView.text = "Информация о пользователе: $login $password"


    }
}






