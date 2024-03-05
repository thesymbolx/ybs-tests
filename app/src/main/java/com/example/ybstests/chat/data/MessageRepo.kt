package com.example.ybstests.chat.data

class MessageRepo(
    private val messageDataSourceRemote: MessageDataSourceRemote,
    private val messageDataSourceLocal: MessageDataSourceLocal
) {
    fun sendMessage() {
        messageDataSourceLocal.saveMessage()
        messageDataSourceRemote.sendMessage()
    }

    fun getMessages() {
        messageDataSourceRemote.sendMessage()
    }

}