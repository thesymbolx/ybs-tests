package com.example.ybstests

import io.cucumber.junit.CucumberOptions

@CucumberOptions(glue = [ "com.example.ybstests" ], tags = "~@wip" , features = ["features"])
class CucumberConfig {
}