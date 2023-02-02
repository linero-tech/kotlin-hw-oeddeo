package lms_129

fun task10(password: String): Boolean {

    val regReq2 = "^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#@$]).{4,10}$"
    val requiredList = listOf("[a-z]", "[A-Z]", "[0-9]", "[#@$]", "^.{0,10}$", "^.{4,}$")
    val result = password.contains(Regex(regReq2))
    if (!result)
        for(each in requiredList){
        if(!password.contains(Regex(each))) {
            print("missing $each --> ")
        }
        }
    return result
    }

fun main() {
    val pwList = listOf("aCa9ab", "AAAaabcAAA239180ewqdioj1#", "psW9$", "aBcD#$", "$1a")
    for(pw in pwList){
    val passed = task10(password = pw)
        println(passed)

        }
}