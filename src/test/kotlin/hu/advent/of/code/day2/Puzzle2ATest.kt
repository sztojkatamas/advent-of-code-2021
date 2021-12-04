package hu.advent.of.code.day2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Puzzle2ATest {

    @Test
    fun testWithTestData() {
        val data = mutableListOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
        val testClass = Puzzle2A()
        assertEquals(150, testClass.calculatePosition(data))
    }
}