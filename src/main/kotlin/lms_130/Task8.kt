package lms_130


fun task8(items: List<Int>): List<Int> {
    val top3 = mutableListOf<Int>()
    val singles = items.toSet().toList()

    for (item in singles) {
        if (top3.size < 3) {
            top3.add(item)
        } else {
            if (item > top3[0]) {
                top3[0] = item
                top3.sort()
            }
        }
    }

    return top3


        /* Poop
        val values = mutableListOf<Int>()
        val step1 = items.toSet().sorted()
        for (index in (step1.size - 3) until step1.size) {
            values.add(step1[index])
        }

        return values

    val top = items.toSet().toList().sortedDescending().take(3).sorted()
    return top
    */
    }


fun main() {
    print(task8(listOf(90, 100, 1, 900, 100, 50, 32, 999, -100)))
}
