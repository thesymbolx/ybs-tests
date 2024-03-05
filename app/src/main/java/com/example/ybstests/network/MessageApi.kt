package com.example.ybstests.network

interface MessageApi {
    fun sendMessage(message: String)
    fun getMessage() : List<String>
}