package days

import util.Day

class Day1: Day() {
    override fun partOne(input: String): String {
        val elves = input.split("\n\n")

        var most = 0
        for (elf in elves) {
            val calories = calculateElfCalories(elf)
            if (calories >= most) {
                most = calories
            }
        }

        return most.toString()
    }

    override fun partTwo(input: String): String {
        val elves = input.split("\n\n")

        val topThree = IntArray(3)
        for (elf in elves) {
            val calories = calculateElfCalories(elf)
            if (calories > topThree[0]) {
                topThree[0] = calories
                topThree.sort()
            }
        }

        return topThree.sum().toString()
    }

    private fun calculateElfCalories(elf: String): Int {
        return elf.split("\n").sumOf { it.toInt() }
    }
}