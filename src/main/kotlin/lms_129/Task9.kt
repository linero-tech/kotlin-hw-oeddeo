package lms_129

import kotlin.math.roundToInt

fun task9(temperature: String): String {


    var temp = temperature.uppercase()
    var result = if ("F" in temp) {
        temp = temp.replace("F", "")
        ((temp.toFloat() -32)/9 *5).roundToInt().toString() + "C"

    }
    else if ("C" in temp) {
        temp = temp.replace("C", "")
        ((temp.toFloat() / 5) * 9 + 32).roundToInt().toString() + "F"
    }
    else {}
    return result.toString()
}
fun main() {
    val answer = task9("20f")
    println(answer)
}
