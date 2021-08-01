package com.evgenynaz.myhomework.homework16.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface MessageDao {
    @Query("SELECT * FROM chat")
    fun getMessageList(): Flow<List<MessageEntity>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMessage(message: MessageEntity)

    @Delete
    suspend fun deleteMessage(message: MessageEntity)
}
