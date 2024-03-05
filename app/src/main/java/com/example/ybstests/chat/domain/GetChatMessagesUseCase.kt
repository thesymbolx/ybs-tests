package com.example.ybstests.chat.domain

import com.example.ybstests.chat.data.MessageRepo

class GetChatMessagesUseCase(
    private val messageRepo: MessageRepo
) {
    operator fun invoke() : List<String> =
        messageRepo.getMessages()

}