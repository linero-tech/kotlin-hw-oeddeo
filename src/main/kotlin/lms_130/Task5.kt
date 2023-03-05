package lms_130

fun task5(items: List<Int>): MutableList<Int> {
    val result = mutableListOf<Int>()
    items.forEachIndexed { index, i -> result.add(index * i) }
    return result
}

fun main() {
    print(task5(listOf(1, 5, 11)))
}
