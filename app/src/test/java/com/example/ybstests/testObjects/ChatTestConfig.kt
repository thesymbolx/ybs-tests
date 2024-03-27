package com.example.ybstests.testObjects

val initialApiMessages = listOf("message 1", "message 2", "message 3")
val initialCachedMessages = listOf("message 4", "message 5", "message 6")

data class ChatTestConfig(
    val api: ChatApiTestConfig = ChatApiTestConfig(),
    val cache: ChatCacheTestConfig = ChatCacheTestConfig()
)

data class ChatApiTestConfig(
    val apiMessages: List<String> = initialApiMessages
)

data class ChatCacheTestConfig(
    val name: String = "John Doe",
    val profileId: String = "12345",
    val cacheMessages: List<String> = initialCachedMessages
)