package com.example.ybstests

import com.example.ybstests.testObjects.CacheApiFake.Companion.lastMessageCache
import com.example.ybstests.testObjects.getChatViewModel
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertIterableEquals

class ChatViewModelTests {

    @Test
    fun `Given I request my messages, then valid messages are returned`() {
        val viewModel = getChatViewModel()
        viewModel.getMessages()
        val messages = viewModel.state.value.messages

        assertIterableEquals(
            listOf("message 1", "message 2", "message 3"),
            messages
        )
    }

    @Test
    fun `Given I send a text message, then the message is cached`() {
        val sentMessage = "sentMessage"
        val viewModel = getChatViewModel()
        viewModel.sendMessageSent(sentMessage)

        assertEquals(sentMessage, lastMessageCache)
    }
}


