package lms_127

fun task8(sentence: String, character: Char): Int {
    val result = sentence.count{it==character}
    return result
}
fun main() {
    task8(sentence = "I code in Kotlin", character = 'I')
}