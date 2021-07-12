package com.evgenynaz.myhomework.homework15

import androidx.room.*


@Dao
interface MessageDao {

    @Query("SELECT * FROM chat_table")
    suspend fun getMessage()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMessage(message: MessageEntity)

    @Delete
    suspend fun delMessage(message: MessageEntity)
}