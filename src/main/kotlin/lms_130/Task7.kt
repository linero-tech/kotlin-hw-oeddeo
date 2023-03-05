package lms_130

fun task7(items: List<Int>): Int {
    var result = if(items.isNotEmpty()) {
        items[0]}
    else {0}
    items.forEach {nr -> if(nr < result) {
        result = nr
    } }

    return result

}
fun main() {
    print(task7(listOf(-100, -10, -5, -20, -30)))
}