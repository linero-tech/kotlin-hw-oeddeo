package lms_130

fun task3(items: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    val set = items.toSet()
    items.forEach{nr -> if((nr in set) && (nr !in result)) {
        result.add(nr)}

    }
    return result
}
fun main() {
    println(task3(items = List(10) {index -> index * 2}))
    println(task3(items = List(10) {index -> index * 0}))
    println(task3(listOf(1, 2, 1, 3, 2, 1, 3, 0, 4, 0)))
}