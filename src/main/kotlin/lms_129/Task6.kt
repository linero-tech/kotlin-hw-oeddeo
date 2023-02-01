package lms_129

fun task6(number: Int): Int {
    var newstrNumber = ""
    for(pos in (number.toString().length -1) downTo 0) {
        newstrNumber += number.toString()[pos]

    }
    val result = newstrNumber.toInt()
    return result
}
fun main() {
    val answer = task6(678)
    println(answer)
}