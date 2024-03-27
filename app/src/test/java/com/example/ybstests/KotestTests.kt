package com.example.ybstests

import com.example.ybstests.chat.ui.ChatViewModel
import com.example.ybstests.chat.ui.MessageUiState
import com.example.ybstests.testObjects.ChatTestConfig
import com.example.ybstests.testObjects.getChatViewModel
import com.example.ybstests.testObjects.initialApiMessages
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class ChatViewModelSpec : BehaviorSpec({
    Given("I am in chat") {
        val viewModel: ChatViewModel = getChatViewModel()
        val stateObserver = viewModel.state
        viewModel.getMessages()

        Then("The existing messages are displayed") {
            stateObserver.value shouldBe MessageUiState(
                messages = initialApiMessages
            )
        }

        When("I send a text message") {
            var textMessage = ""
            beforeEach {
                viewModel.sendMessageSent(textMessage)
            }

            And("It is valid") {
                textMessage = "1st sent message"

                Then("It is displayed") {
                    viewModel.getMessages()
                    stateObserver.value shouldBe MessageUiState(
                        messages = initialApiMessages + textMessage
                    )
                }
            }

            And("It is not valid") {
                textMessage = "* invalid message"

                Then("It is not displayed") {
                    viewModel.getMessages()
                    stateObserver.value shouldBe MessageUiState(
                        messages = initialApiMessages + "1st sent message"
                    )
                }
            }

        }
    }
})