//Leap Year: Determine if a given year is a leap year (Divisible by 4, but if divisible by 100, it must also be divisible by 400).

fun main (){
    print("Enter the Year : ")
    var year = readln().toInt()

    if (year % 4==0){
        if(year %100==0){
            if (year % 400==0){
               println("This is a leap year")
            }
            else {
                println("This is not a leap year")
            }
        }
        else {
            println("This is a leap year")
        }
    }
    else {
        println("This is not a leap year")
    }

}