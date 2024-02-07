package com.example.ybstests

import android.util.Log
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class TestStep {
    @When("the Maker starts a game")
    fun a() {
        //Log.d("test", "a() called")
    }

    @Then("the Maker waits for a Breaker to join")
    fun b() {
        println("function b")
    }
}