package lms_130

fun task3(items: List<Int>): List<Int> {
    val mySet = mutableSetOf<Int>()
    val myList = mutableListOf<Int>()
    items.forEach { nr ->
        if (nr !in myList) myList.add(nr)
        else mySet.add(nr)

    }
    return mySet.toList()
}

fun main() {
    println(task3(items = List(10) { index -> index * 2 }))
    println(task3(items = List(10) { index -> index * 0 }))
    println(task3(listOf(1, 2, 1, 3, 2, 1, 3, 0, 4, 0)))
}