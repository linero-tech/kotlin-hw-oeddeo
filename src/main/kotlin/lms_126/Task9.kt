package lms_126

fun task9(): String {

    return """
        output: "enter code"
        input: pin code
        step: check code
        while code is not correct and attempts < 3
            output: "incorrect code, try again"
            input: pin code
            step: check code, attempt counter increase  
    
        if attempts equals 3
            output: "no card for u", - card
        if code is correct
            input: amount to withdraw
            step: check amount vs balance
            while amount > account balance
                output: "insufficient funds, try again"
                input: amount to withdraw
            if amount < or equal to balance
                output: cash, "receipt?"
                input: yes/no
                if yes
                    output: receipt
                else
                    ignore
               
            
   
       
        
    """.trimIndent()
}
