package com.example.ybstests

import android.content.Intent
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.cucumber.java.Before
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ScreenOneTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

//    @get:Rule
//    val composeTestRule = createAndroidComposeRule<MainActivity>()


    //private val screenOneRobot = ScreenOneRobot()

    @When("I start the application")
    fun iStartTheApplication() {
      //  screenOneRobot.startApplication()
    }

    @Then("the Maker waits for a Breaker to join")
    fun b() {
       // println("function b")
    }
}