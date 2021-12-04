package hu.advent.of.code.day1

import hu.advent.of.code.BaseChallenge


class Puzzle1A: BaseChallenge() {

    override fun run() {
        println("\nDay 1 - Puzzle 1")
        loadDataFromFile("data1.txt")

        println("Depth count = ${countDepth(data)}")
    }

    fun countDepth(depthdata: MutableList<String>) : Int {

        var previous = depthdata[0].toInt()
        var depthCounter = 0
        for (i in depthdata) {
            if (previous < i.toInt()) {
                depthCounter++
            }
            previous = i.toInt()
        }
        return depthCounter
    }
}