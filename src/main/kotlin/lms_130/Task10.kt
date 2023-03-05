package lms_130

fun task10(items: List<Int>): List<Int> {
    var result = mutableListOf<Int>()
    items.forEach { nr -> if (nr % 2 == 0) {
        result.add(nr *2)
    }else {
        result.add(nr * 3)
    } }
    return result
}
fun main() {
    print(task10(listOf(1, 2, 3, 4, 5)))
}