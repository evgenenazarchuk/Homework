package com.evgenynaz.myhomework.homework16.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chat")
class MessageEntity(
    @PrimaryKey val message: String,
    val date: String
)


