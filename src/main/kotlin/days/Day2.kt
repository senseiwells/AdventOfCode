package days

import util.Day

class Day2: Day() {
    override fun partOne(input: String): String {
        val m = mapOf("AX" to 4, "AY" to 8, "AZ" to 3, "BX" to 1, "BY" to 5, "BZ" to 9, "CX" to 7, "CY" to 2, "CZ" to 6)
        return input.replace(" ", "").split("\n").sumOf { game -> m[game]!! }.toString()
    }

    override fun partTwo(input: String): String {
        val m = mapOf("AX" to 3, "AY" to 4, "AZ" to 8, "BX" to 1, "BY" to 5, "BZ" to 9, "CX" to 2, "CY" to 6, "CZ" to 7)
        return input.replace(" ", "").split("\n").sumOf { game -> m[game]!! }.toString()
    }
}