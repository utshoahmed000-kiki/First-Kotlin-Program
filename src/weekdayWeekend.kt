//Weekend or Weekday: Given a number (1-7), print if it’s a "Weekday" or "Weekend."

fun main() {
    print("Enter the day: ")
    val day = readLine()!!.toInt()

    val a = when (day) {

        1 -> "weekday"
        2 -> "weekday"
        3 -> "weekday"
        4 -> "weekday"
        5 -> "weekday"
        6 -> "weekday"
        7 -> "weekend day"


        else ->"invalid input"

    }
    println(a)


}









