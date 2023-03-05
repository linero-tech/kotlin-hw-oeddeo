package lms_130

fun task1(items: List<Int>): Int {
    val result = if(items.isEmpty()) {
        0
    }else {items.random()}

    return result
}
fun main() {
    print(task1(items = listOf(1, 3, 9, 10, 99, 50)))
}