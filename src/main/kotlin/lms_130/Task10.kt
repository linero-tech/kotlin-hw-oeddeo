package lms_130

fun task10(items: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    items.forEach { nr ->
        result.add(
            if (nr % 2 == 0) nr * 2
            else nr * 3
        )
    }
    return result
}

fun main() {
    print(task10(listOf(1, 2, 3, 4, 5)))
}