package com.evgenynaz.myhomework.homework10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgenynaz.myhomework.databinding.ActivityHomework10Binding

class Homework10Activity : AppCompatActivity() {

    private lateinit var binding: ActivityHomework10Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework10Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val candyAdapter = CandyAdapter(candyView())

        binding.rvCandy?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvCandy?.adapter = candyAdapter
    }
}