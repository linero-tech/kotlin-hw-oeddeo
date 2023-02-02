package lms_129

fun task2(number: Int): Boolean {
    var result = number > 1
    for(num in 2 until number){
        if(number % num == 0){
             false
        }
    }
    return result
}
fun main() {
   val answer = task2(number = 11)
    println(answer)
}