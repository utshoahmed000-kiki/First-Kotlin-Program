//Weekend or Weekday: Given a number (1-7), print if it’s a "Weekday" or "Weekend."

fun main (){
    print("Enter the day : ")
    var day =readln().toInt()


    if (day>=1 && day<=6){
        println("Weekday")
    }
    else if (day>6 && day<8){
        println("Weekend")
    }
    else {
        println("Invalid day")
    }

}