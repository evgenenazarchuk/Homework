package com.evgenynaz.myhomework.homework16

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgenynaz.myhomework.R
import com.evgenynaz.myhomework.databinding.ActivityHomework16Binding
import org.koin.android.viewmodel.ext.android.viewModel



class Homework16Activity : AppCompatActivity() {

    private var listMessage: MutableList<Message> = mutableListOf()
    private lateinit var binding: ActivityHomework16Binding
    private val viewModels: Homework16ViewModel by viewModel()
//        HomeWork15ViewModelFactory((application as MySuperApp).messageRepository)
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val messageAdapter = MessageAdapter() {
            clickListener(it) }

        binding = ActivityHomework16Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMessage.setOnClickListener {

            with(binding.editTextMessage) {
                viewModels.addMessageToDatabase(text.toString())
                setText("")
            }

//binding.editTextMessage.apply {
//    myViewModel.addMessageToDatabase(text.toString())
//    setText("")
//}
        }


        binding.rvMessage?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvMessage?.adapter = messageAdapter

        viewModels.messageListLiveData.observe(this, Observer {
            messageAdapter.submitList(it)
        })

//        Создание раздилительной полоски
        val horizontalDecoration =
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        horizontalDecoration.setDrawable(ContextCompat.getDrawable(this, R.drawable.line_divider)!!)
        binding.rvMessage.addItemDecoration(horizontalDecoration)
    }

    fun clickListener(message: Message) {

        viewModels.deleteMessage(message)
    }
}