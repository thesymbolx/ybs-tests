package com.example.ybstests

import kotlinx.coroutines.flow.MutableStateFlow

class ChatViewModel(
    private val getChatMessagesUseCase: GetChatMessagesUseCase,
    private val sendTextMessageUseCase: SendTextMessageUseCase,
    private val user: User
) : BaseViewModel() {

    data class State(
        val messages: List<MessageUiModel>
    )

    val state: MutableStateFlow<State>
        get() = getChatMessagesUseCase(user).map {
            val messageUiModelList = MessageUiModelMapper.fromMessagesList(it)
            State(messageUiModelList)
        }

    fun onTextMessageSent(text: String) {
        sendTextMessageUseCase(text, user).safeSubscribe()
    }
}