package com.example.ybstests.chat.data

import com.example.ybstests.network.FakeMessageApi

class MessageDataSourceRemote(
    private val fakeMessageApi: FakeMessageApi
) {
    fun sendMessage() {
        fakeMessageApi.sendMessage()
    }
}