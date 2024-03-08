package com.example.ybstests.network

data class UserMessages(
    val name: String,
    val profileId: String,
    val messages: List<String>
)