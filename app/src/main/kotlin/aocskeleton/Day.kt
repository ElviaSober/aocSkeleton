package aocskeleton

interface Day {

    val index: Int

    fun partOne(lines: List<String>): Int

    fun partTwo(lines: List<String>): Long
}