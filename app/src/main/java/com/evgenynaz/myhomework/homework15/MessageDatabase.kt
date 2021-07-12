package com.evgenynaz.myhomework.homework15

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MessageEntity::class], version = 1)
abstract class MessageDatabase : RoomDatabase() {
    abstract fun MessageDao(): MessageDao
}