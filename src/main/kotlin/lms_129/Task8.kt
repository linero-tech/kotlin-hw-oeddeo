package lms_129

fun task8(number: Int): Int {
    var result = 0

    for (each in number.toString()) {
        val poop = "poop"
        println(each::class.java.typeName)
        result += each.digitToInt()
        println(result::class.java.typeName)
        println(poop::class.java.typeName)
    }
    return result
}
fun main() {
    val answer = task8(123)
    println(answer)
}
