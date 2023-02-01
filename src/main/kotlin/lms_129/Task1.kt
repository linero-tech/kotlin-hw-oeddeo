package lms_129

fun task1(a: Int, b: Int): Int {
    var result = 0
    for(num in a..b)
        result += num


    return result
}
fun main() {
    val b = task1(a = 1, b = 5)
    println(b)
}
