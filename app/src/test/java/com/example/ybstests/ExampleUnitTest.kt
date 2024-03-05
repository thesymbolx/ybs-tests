package com.example.ybstests

import com.example.ybstests.chat.data.MessageDataSourceLocal
import com.example.ybstests.chat.data.MessageDataSourceRemote
import com.example.ybstests.chat.data.MessageRepo
import com.example.ybstests.chat.domain.GetChatMessagesUseCase
import com.example.ybstests.chat.domain.SendTextMessageUseCase
import com.example.ybstests.chat.ui.ChatViewModel
import com.example.ybstests.network.CacheApi
import com.example.ybstests.network.MessageApi
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.Test

import org.junit.Assert.*

val fakeCache = object : CacheApi {
    override fun saveMessage() {

    }
}

val fakeApi = object : MessageApi {
    override fun sendMessage() {

    }

    override fun getMessage(): List<String> {
        return listOf(
            "fake 1", "fake 2", "fake 2"
        )
    }
}

val messageRepo = MessageRepo(
    messageDataSourceRemote = MessageDataSourceRemote(fakeApi),
    messageDataSourceLocal = MessageDataSourceLocal(fakeCache)
)

val chatVm = ChatViewModel(
    getChatMessagesUseCase = GetChatMessagesUseCase(messageRepo),
    sendTextMessageUseCase = SendTextMessageUseCase(messageRepo),
)

class MyTests : StringSpec({
    "strings.length should return size of string" {
        "hello".length shouldBe 5
    }

    "when the view model is started" {
        //jashdkahsdkhaskdjhakjshd
        "the do tthis" {

        }
    }
})


