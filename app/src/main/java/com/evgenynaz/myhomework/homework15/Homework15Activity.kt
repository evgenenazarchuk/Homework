package com.evgenynaz.myhomework.homework15

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgenynaz.myhomework.databinding.ActivityHomework15Binding
import java.util.Observer

class Homework15Activity : AppCompatActivity() {

    private var listMessage: MutableList<Message> = mutableListOf()
    private lateinit var binding: ActivityHomework15Binding
    private val myViewModel: MessageVievModel by viewModels {
        MessageViewModelFactory((application as MySuperApp).messageRepository)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val messageAdapter = MessageAdapter(listMessage) { clickListener(it) }

        binding = ActivityHomework15Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMessage.setOnClickListener {

            with(binding.editTextMessage) {
                myViewModel.addMessageToDatabase(text.toString())
                setText("")
            }

        }


        binding.rvMessage?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvMessage?.adapter = messageAdapter

        myViewModel.messageListLiveData.observe(this, Observer())

    }

    private fun Observer() {

    }

    fun clickListener(message: Message) {

        myViewModel.deleteMessage(message)
    }
}

private fun <T> LiveData<T>.observe(homework15Activity: Homework15Activity, observer: Observer) {

}
