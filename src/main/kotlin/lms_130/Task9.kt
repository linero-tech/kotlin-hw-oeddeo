package lms_130

fun task9(items: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    items.forEachIndexed { index, i -> if(index == 0) {
        result.add(i * i)
    }else {result.add(i * items[index -1])}
    }
    return result
}
fun main() {
    print(task9(listOf(-2, -5, 2, 10, 3)))
}