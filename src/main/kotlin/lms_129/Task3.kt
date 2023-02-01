package lms_129

fun task3(number: Int): Int {
    var result = 1
    for(nr in number downTo 1) {
    result = result * nr }

    return result
}
fun main() {
    val answer = task3(number = 5)
    println(answer)
}