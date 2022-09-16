package aocskeleton.utils

object InputConverter {
    fun rowToInts(row: String, delimiter: Char): List<Int> = row.split(delimiter).map { it.trim().toInt() }
}