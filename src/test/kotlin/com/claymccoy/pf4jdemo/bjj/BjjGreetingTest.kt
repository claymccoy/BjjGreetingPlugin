package com.claymccoy.pf4jdemo.bjj

import dev.minutest.junit.JUnit5Minutests
import dev.minutest.rootContext
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class BjjGreetingTest : JUnit5Minutests {

    fun tests() = rootContext {
        test("respond with BJJ greeting") {
            expectThat(BjjGreeting().greeting).isEqualTo("OSS!")
        }
    }
}
