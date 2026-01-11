fun main (){
    println("enter the day")
    val day = readln().toInt()


    val z =when (day){
        1-> "saturday"
        2-> "sunday"
        3-> "monday"
        4-> "tuesday"
        5-> "wednesday"
        6-> "thursday"
        7-> "friday"


        else -> "invalid day"
    }
    println(z)
}