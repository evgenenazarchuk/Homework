package com.evgenynaz.myhomework.homework17

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgenynaz.myhomework.MySuperApp
import com.evgenynaz.myhomework.databinding.ActivityHomework17Binding


class CurrencyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomework17Binding
    private val myViewModel: Homework17ViewModel by viewModels {
        Homework17ViewModel.HomeWork17ViewModelFactory((application as MySuperApp).currencyRepository)
    }

    private val currencyAdapter: CurrencyAdapter = CurrencyAdapter()
    private lateinit var sortName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomework17Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.rvCurrency) {
            adapter = currencyAdapter
            layoutManager = LinearLayoutManager(this@CurrencyActivity)
        }
    }
}