package com.example.ybstests.chat.data

import com.example.ybstests.network.MessageApi

class MessageDataSourceRemote(
    private val messageApi: MessageApi
) {
    fun sendMessage() {
        messageApi.sendMessage()
    }

    fun getMessage() : List<String> {
        return messageApi.getMessage()
    }
}