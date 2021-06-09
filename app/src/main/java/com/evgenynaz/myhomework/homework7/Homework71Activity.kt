package com.evgenynaz.myhomework.homework7


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.evgenynaz.myhomework.databinding.ActivityHomework71Binding


class Homework71Activity : AppCompatActivity() {
    private lateinit var binding: ActivityHomework71Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework71Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        val login = intent.getStringExtra("LOGIN")
        val password = intent.getStringExtra("PASSWORD")
        binding.tvView.text = "Информация о пользователе: $login $password"
        binding.buttonClose.setOnClickListener {
            finish()
        }

    }
}








