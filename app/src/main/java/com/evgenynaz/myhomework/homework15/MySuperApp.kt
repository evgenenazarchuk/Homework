package com.evgenynaz.myhomework.homework15

import android.app.Application
import androidx.room.Room


class MySuperApp : Application() {

    private val messageDatabase: MessageDatabase by lazy {
        Room.databaseBuilder(this, MessageDatabase::class.java, "message_database").build()
    }
    private val messageDao: MessageDao by lazy { messageDatabase.MessageDao() }

    val messageRepository: MessageRepositiry by lazy { MessageRepositiry(messageDao) }
    override fun onCreate() {
        super.onCreate()


    }
}