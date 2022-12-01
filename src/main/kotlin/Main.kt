import util.Day
import util.Resource

fun main() {
    println("Input day number:")
    val dayNumber = readln()
    val clazz = Class.forName("days.Day$dayNumber")
    val day = clazz.getConstructor().newInstance() as Day

    val partOneInput = Resource.readAndSanitise("Day${dayNumber}_1.txt")
    println("Part One Output:\n${day.partOne(partOneInput)}")

    val partTwoInput = Resource.readAndSanitise("Day${dayNumber}_2.txt")
    println("Part Two Output:\n${day.partTwo(partTwoInput)}")
}