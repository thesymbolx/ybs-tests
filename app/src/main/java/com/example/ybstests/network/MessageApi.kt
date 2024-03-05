package com.example.ybstests.network

interface MessageApi {
    fun sendMessage()
    fun getMessage() : List<String>
}