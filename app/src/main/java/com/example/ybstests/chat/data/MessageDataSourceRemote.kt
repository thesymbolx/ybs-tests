package com.example.ybstests.chat.data

import com.example.ybstests.network.MessageApi

class MessageDataSourceRemote(
    private val messageApi: MessageApi
) {
    fun sendMessage(message: String) {
        messageApi.sendMessage(message)
    }

    fun getMessage() : List<String> {
        return messageApi.getMessage()
    }
}