package lms_129

fun task4(): Int {
    var result = 0
    for(nr in 1..1000) {
        if(nr % 9 == 0) {
            result = result + nr
        }
    }

    return result
}
fun main() {
    val answer = task4()
    println(answer)
}
