package com.example.ybstests.testObjects

import com.example.ybstests.network.CacheApi
import com.example.ybstests.network.MessageApi
import com.example.ybstests.network.UserMessages


class CacheApiFake(private val chatCacheTestConfig: ChatCacheTestConfig) : CacheApi {
    companion object {
        var lastMessageCache: String? = null
    }

    init {
        lastMessageCache = null
    }

    override fun saveMessage(message: String) {
        lastMessageCache = message
    }

    override fun getUserMessages(): UserMessages {
        return with(chatCacheTestConfig) {
            UserMessages(
                name = name,
                profileId = profileId,
                messages = cacheMessages
            )
        }
    }
}

class MessageApiFake(private val chatApiTestConfig: ChatApiTestConfig) : MessageApi {
    companion object {
        var lastMessage: String? = null
    }

    init {
        lastMessage = null
    }

    override fun sendMessage(message: String) {
        lastMessage = message
    }

    override fun getMessage(): List<String> {
        return chatApiTestConfig.apiMessages
    }
}