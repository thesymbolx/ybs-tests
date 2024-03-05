package com.example.ybstests.chat.data

class MessageRepo(
    private val messageDataSourceRemote: MessageDataSourceRemote,
    private val messageDataSourceLocal: MessageDataSourceLocal
) {
    fun sendMessage(message: String) {
        messageDataSourceLocal.saveMessage()
        messageDataSourceRemote.sendMessage(message)
    }

    fun getMessages() : List<String> {
        return messageDataSourceRemote.getMessage()
    }

}