package com.example.ybstests.chat.domain

import com.example.ybstests.chat.data.MessageRepo

class SendTextMessageUseCase(
    private val messageRepo: MessageRepo
) {
    operator fun invoke(text: String) {
        messageRepo.sendMessage(text)
    }
}