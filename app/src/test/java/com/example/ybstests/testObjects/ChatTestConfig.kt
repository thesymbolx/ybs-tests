package com.example.ybstests.testObjects

data class ChatTestConfig(
    val api: ChatApiTestConfig = ChatApiTestConfig(),
    val cache: ChatCacheTestConfig = ChatCacheTestConfig()
)

data class ChatApiTestConfig(
    val apiMessages: List<String> = listOf("message 1", "message 2", "message 3")
)

data class ChatCacheTestConfig(
    val name: String = "John Doe",
    val profileId: String = "12345",
    val cacheMessages: List<String> = listOf("message 4", "message 5", "message 6")
)