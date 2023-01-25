package lms_127

fun task10_1(assessments: String): Int {
    val result = assessments.length
    return result
}

fun task10_2(assessments: String): Char {
    val result = assessments[3]
    return result
}

fun task10_3(assessments: String): Char {
    val pos = assessments.length / 2
    val result = assessments[pos]
    return result
}

fun task10_4(assessments: String): String {
    val result = assessments.subSequence(0, 3).toString()

    return result
}
fun main() {
    task10_1(assessments = "LMHHF")
    task10_2("LMFHMF")
    task10_3("LMFHM")
    task10_4(assessments = "LMFHM")
}