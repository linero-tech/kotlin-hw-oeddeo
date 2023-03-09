package lms_130


fun task8(items: List<Int>): List<Int> {

   var top3 = mutableListOf(items[0], items[1], items[2]).sorted().toMutableList()
    items.forEach { item ->
        if (item > top3[0] && item !in top3) {
            top3[0] = item
            top3 = top3.sorted().toMutableList()
        }
    }
    return top3.toSet().toList()

    /*
    Alt 1:
    val hitList1 = mutableListOf(10, 10, 10, 10, 10, 10, 10, 1, 100)
    var topHits = mutableListOf<Int>()
    hitList1.forEach { nr -> if (topHits.size < 3 && nr !in topHits) {
        topHits.add(nr)
    }else {
        if(nr > topHits.sorted()[0]) {
            topHits[0] = nr
            topHits = topHits.sorted().toMutableList()
        }

    } }
    println(topHits.sorted())

     */



}


fun main() {
    print(task8(listOf(1, 10, 9, 100, 50, 30, 20, 90, 200, 0, 5)))
}
