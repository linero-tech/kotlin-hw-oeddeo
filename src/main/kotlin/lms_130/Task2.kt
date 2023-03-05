package lms_130

fun task2(items: List<Int>): Int {
    var result = 0
    items.forEachIndexed { index, i -> if (index % 2 == 0) {
        result += i }
    }
    return result
}
fun main() {
    print(task2(listOf(4, 3, 8, 10, -1, 0, -2, -5, -9)))
}