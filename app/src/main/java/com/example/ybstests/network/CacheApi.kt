package com.example.ybstests.network

interface CacheApi {
    fun saveMessage(message: String)
    fun getUserMessages() : UserMessages
}