package lms_130

fun task4(items: List<Int>, factor: Int): List<Int> {
    val result = mutableListOf<Int>()
    items.forEach { element -> if(element % factor == 0) {
        result.add(element)

    } }

    return result
}
fun main() {
    print(task4(items = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15), factor = 2))
}