package com.harvey.runningapp

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.concurrent.TimeUnit

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val timeVal: Long = ((2*60*60) + (25*60)) * 1000
        println(TimeUnit.MILLISECONDS.toHours(timeVal))
        println(TimeUnit.MILLISECONDS.toMinutes(timeVal))
        true
    }
}
