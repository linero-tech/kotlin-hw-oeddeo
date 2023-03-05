package lms_130

fun task12_1(sells: List<Int>): String {
    // most sells:
    val days = listOf("Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    var max = 0
    var result = ""
    sells.forEachIndexed { index, i -> if(i > max) {
        max = i
        result = days[index]
    }  }
   return result
}

fun task12_2(sells: List<Int>): String {
    val days = listOf("Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    var min = sells[0]
    var result = days[0]
    sells.forEachIndexed { index, i ->  if(i < min) {
        min = i
        result = days[index]
    } }

    return result
}

fun task12_3(sells: List<Int>): Int {
    var result = 0
    sells.forEach { sell -> result += sell }

    return result
}
fun main() {
    println(task12_1(listOf(100, 1000, 800, 300, 768, 765, 9)))
    println(task12_2(listOf(200, 100, 800, 768, 765, 90, 100)))
    println(task12_3(listOf(5, 10, 15, 20, 25, 30, 35)))
}