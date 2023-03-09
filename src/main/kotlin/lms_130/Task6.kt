package lms_130

fun task6(sentence: String): String {
    var result = ""
    sentence.forEachIndexed { index, c ->
        result +=
            if (index % 2 == 0) c.uppercase()
            else c
    }
    return result
}

fun main() {
    println(task6("I like Gothenburg"))
}