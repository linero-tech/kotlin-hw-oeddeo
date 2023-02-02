package lms_129

fun task1(a: Int, b: Int): Int {
    var result = 0
    if (a != b){
        for(num in a..b){
            println(num)
            result += num}
}   else result = 0

    return result
}
fun main() {
    val b = task1(a = -5, b = -5)
    println(b)
}
