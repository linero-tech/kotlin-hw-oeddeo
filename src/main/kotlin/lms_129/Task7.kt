package lms_129

fun task7(a: Int, b: Int): Int {
    var result = 1
    for(nr in 1..b) {
        result *= a
    }
    return result
    }



fun main() {
   val answer =  task7(2, 3)
    println(answer)
}