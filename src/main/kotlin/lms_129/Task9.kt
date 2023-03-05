package lms_129

import kotlin.math.truncate

fun task9(temperature: String): String {
    val temp = temperature.dropLast(1).toFloat()
    val result = if (temperature.contains("f", ignoreCase = true)) {
        truncate((temp -32)/9 *5).toInt().toString() + "C"
    }
    else {
        truncate((temp / 5) * 9 + 32).toInt().toString() + "F"
    }
    return result
}
fun main() {
    val answer = task9("-20f")
    println(answer)
}