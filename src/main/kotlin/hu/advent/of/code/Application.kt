package hu.advent.of.code

import hu.advent.of.code.day1.Puzzle1A
import hu.advent.of.code.day1.Puzzle1B
import hu.advent.of.code.day2.Puzzle2A
import hu.advent.of.code.day2.Puzzle2B
import hu.advent.of.code.day3.Puzzle3A
import hu.advent.of.code.day3.Puzzle3B

class Application {
    fun doit() {
        val puzzles = listOf(
            Puzzle1A(), Puzzle1B(), Puzzle2A(), Puzzle2B(), Puzzle3A(), Puzzle3B()
        )
        puzzles.forEach { it.run() }
    }
}

fun main() {
    Application().doit()
}
