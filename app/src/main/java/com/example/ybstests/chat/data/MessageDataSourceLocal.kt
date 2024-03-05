package com.example.ybstests.chat.data

import com.example.ybstests.network.CacheApi

class MessageDataSourceLocal(
    private val cacheApi: CacheApi
) {
    fun saveMessage(message: String) {
        cacheApi.saveMessage(message)
    }
}