package com.evgenynaz.myhomework.homework15

class MessageRepositiry(
    private val messageDao: MessageDao
) {

    suspend fun getMessage() = messageDao.getMessage().map { messageEntities ->
            messageEntities.map { messageEntities ->
                Message(messageEntities.message, messageEntities.date)
            }
        }

    suspend fun addMessages(message: MessageEntity) {
        messageDao.addMessage(message)

    }

    suspend fun deleteMessage(message: Message) {

        messageDao.delMessage(message.entity())
    }

    private fun Message.entity() =
        MessageEntity(this.message, this.date)
}