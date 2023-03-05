package lms_130

fun task6(sentence: String): String {
    var result = ""
    sentence.forEachIndexed { index, c -> if (index % 2 == 0) {
        result += c.uppercase()
    }else {result += c} }
    return result
}
fun main() {
    println(task6("I like Gothenburg"))
}