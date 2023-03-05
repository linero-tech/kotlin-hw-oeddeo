package lms_130

fun task13_1(customers: List<String>): List<String> {
    return customers.toSet().toList()
}

fun task13_2(customers: List<String>): List<String> {
    val double = mutableListOf<String>()
    val result = mutableListOf<String>()
    customers.forEach { customer -> if (customer !in result) {
        result.add(customer)
    }else {double.add(customer)} }
    return double
}

fun task13_3(customers: List<String>): List<String> {
    val companies = mutableSetOf<String>()
    customers.forEach { customer ->
        run {
            companies.add(
                customer.split("@", ".")[1]
            )
        }
    }
    return companies.toList()
}

fun main() {
    val listOfCustomer = listOf(
        "tgundrey1l@prlog.org",
        "bgrix1u@apache.org",
        "mbreakspear1v@wordpress.com",
        "cdalli1w@ft.com",
        "rclayborn1x@mtv.com",
        "rclayborn1x@mtv.com",
        "jchidlow1y@nasa.gov",
        "jchidlow1y@nasa.gov",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com"
    )

    println("The customers who purchased from your product: ${task13_1(listOfCustomer)}")
    println("${task13_1(listOfCustomer).size}")
    println("The customers that purchased multiple times include: ${task13_2(listOfCustomer)}")
    println("The companies that purchased from you include: ${task13_3(listOfCustomer)}")
}
