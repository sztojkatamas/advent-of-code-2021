package hu.advent.of.code

import hu.advent.of.code.day1.Puzzle1A

class Application {
    fun doit() {
        val puzzles = listOf<BaseChallenge>(
            Puzzle1A()
        )
        puzzles.forEach { it.run() }
    }
}

fun main() {
    Application().doit()
}
