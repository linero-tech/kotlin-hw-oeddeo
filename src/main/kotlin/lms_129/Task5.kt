package lms_129

fun task5(sentence: String): Int {
    var result = 0
    for(nr in sentence) {
        result += 1
    }
    return result
}
fun main() {
    val answer = task5("I love GBG")
    println(answer)
}