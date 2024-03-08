package com.example.ybstests.chat.ui

import androidx.lifecycle.ViewModel
import com.example.ybstests.chat.domain.GetChatMessagesUseCase
import com.example.ybstests.chat.domain.SendTextMessageUseCase
import kotlinx.coroutines.flow.MutableStateFlow

class ChatViewModel(
    private val getChatMessagesUseCase: GetChatMessagesUseCase,
    private val sendTextMessageUseCase: SendTextMessageUseCase,
) : ViewModel() {

    val state = MutableStateFlow(MessageUiState())

    fun getMessages() {
        state.value = MessageUiState(getChatMessagesUseCase.invoke())
    }

    fun sendMessageSent(text: String) {
        sendTextMessageUseCase(text)
    }
}