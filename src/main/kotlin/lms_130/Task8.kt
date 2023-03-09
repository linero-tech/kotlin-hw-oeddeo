package lms_130


fun task8(items: List<Int>): List<Int> {

    val values = mutableListOf<Int>()
    val step1 = items.toSet().sorted()
    for (index in (step1.size - 3) until step1.size) {
        values.add(step1[index])
    }

    return values


}


fun main() {
    print(task8(listOf(90, 100, 1, 900, 100, 50, 32, 999, -100)))
}
