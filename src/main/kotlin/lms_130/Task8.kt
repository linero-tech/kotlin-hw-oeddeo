package lms_130

fun task8(items: List<Int>): List<Int> {

    var top3 = mutableListOf(items[0], items[1], items[2]).sorted().toMutableList()
    items.forEach { item -> if(item > top3[0] && item !in top3) {
        top3[0] = item
        top3 = top3.sorted().toMutableList()

    } }

    return top3.toSet().toList()
}
fun main() {
    print(task8(listOf(-100, -100, -100)))
}
