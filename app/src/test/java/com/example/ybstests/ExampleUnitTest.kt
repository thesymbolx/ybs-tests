package com.example.ybstests

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MyTests : StringSpec({
    "Given I send a text message" {
        chatVm.onTextMessageSent("fake message")
    }

    "Then the message is cached and sent" {
        "fake message" shouldBe lastMessageCache
        "fake message" shouldBe lastMessage
    }
})


