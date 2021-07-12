package com.evgenynaz.myhomework.homework15

import androidx.room.Entity

@Entity (tableName = "chat_table", primaryKeys = ["message"])
data class MessageEntity (
    val message:String,
    val date: String
)

