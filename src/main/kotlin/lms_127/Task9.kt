package lms_127

fun task9(sentence: String, character: Char): Boolean {
    val result = (sentence.contains(character.uppercase())or sentence.contains(character.lowercase()))
    return result
}
fun main() {
    task9(sentence = "I code in KOTLIN", character = 'i')
}