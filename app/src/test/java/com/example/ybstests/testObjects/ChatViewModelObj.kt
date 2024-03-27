package com.example.ybstests.testObjects

import com.example.ybstests.chat.data.MessageDataSourceLocal
import com.example.ybstests.chat.data.MessageDataSourceRemote
import com.example.ybstests.chat.data.MessageRepo
import com.example.ybstests.chat.domain.GetChatMessagesUseCase
import com.example.ybstests.chat.domain.SendTextMessageUseCase
import com.example.ybstests.chat.ui.ChatViewModel

private fun getMessageRepo(chatTestConfig: ChatTestConfig) =
    MessageRepo(
        messageDataSourceRemote = MessageDataSourceRemote(MessageApiFake(chatTestConfig.api)),
        messageDataSourceLocal = MessageDataSourceLocal(CacheApiFake(chatTestConfig.cache))
    )

fun getChatViewModel(chatTestConfig: ChatTestConfig = ChatTestConfig()) =
    getMessageRepo(chatTestConfig).run {
        ChatViewModel(
            getChatMessagesUseCase = GetChatMessagesUseCase(this),
            sendTextMessageUseCase = SendTextMessageUseCase(this),
        )
    }
