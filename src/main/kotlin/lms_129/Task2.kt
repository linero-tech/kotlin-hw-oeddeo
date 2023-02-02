package lms_129

fun task2(number: Int): Boolean {
    var result = true
    if(number > 1) {
        for(num in 2 until number ) {
            if (number % num == 0) {
                result = false
            }
        }
    }else result = false
    return result
}
fun main() {
   val answer = task2(number = 66)
    println(answer)
}