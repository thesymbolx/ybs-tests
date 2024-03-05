package com.example.ybstests.chat.data

import com.example.ybstests.network.FakeCacheApi

class MessageDataSourceLocal(
    private val fakeCacheApi: FakeCacheApi
) {
    fun saveMessage() {
        fakeCacheApi.saveMessage()
    }
}