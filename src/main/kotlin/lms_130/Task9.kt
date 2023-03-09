package lms_130

fun task9(items: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    items.forEachIndexed { index, i ->
        result.add(
            if (index == 0) i * i
            else i * items[index - 1]
        )
    }
    return result
}

fun main() {
    print(task9(listOf()))
}