package lms_130

fun task12_1(sells: List<Int>, days: List<String>): String {
    // most sells:

    var max = 0
    var result = ""
    sells.forEachIndexed { index, i -> if(i > max) {
        max = i
        result = days[index]
    }  }
   return result
}

fun task12_2(sells: List<Int>, days: List<String>): String {
    var min = if(sells.isNotEmpty()) {sells[0]} else {0}
    var result = ""
    sells.forEachIndexed { index, i ->  if(i < min) {
        min = i
        result = days[index]} }
    print("min is $result")
    return result
}

fun task12_3(sells: List<Int>): Int {
    var result = 0
    sells.forEach { sell -> result += sell }

    return result
}
fun main() {
    val days = listOf("Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println(task12_1(listOf(20000, 1000, 800, 300, 768, 765, 9), days))
    println(task12_2(listOf(20, 100, 800, 768, 765, 90, 100), days))
    println(task12_3(listOf(5, 10, 15, 20, 25, 30, 35)))
}