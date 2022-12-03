package days

import util.Day

class Day3: Day() {
    override fun partOne(input: String): String {
        val rucksacks = input.split("\n")
        var priority = 0
        for (rucksack in rucksacks) {
            val half = rucksack.length / 2
            val first = rucksack.substring(0, half)
            val second = rucksack.substring(half)
            for (int in first.chars()) {
                if (!second.contains(int.toChar())) {
                    continue
                }
                priority += calculatePriority(int)
                break
            }
        }
        return priority.toString()
    }

    override fun partTwo(input: String): String {
        val groups = input.split("\n").chunked(3)
        var priority = 0
        for ((first, second, third) in groups) {
            for (int in first.chars()) {
                val char = int.toChar()
                if (!second.contains(char) || !third.contains(char)) {
                    continue
                }
                priority += calculatePriority(int)
                break
            }
        }
        return priority.toString()
    }

    private fun calculatePriority(character: Int): Int {
        return if (character in 0x41..0x5A) character - 0x40 + 26 else character - 0x60
    }
}