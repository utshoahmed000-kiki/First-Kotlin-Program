fun main (){
    print("ENter the number : ")
    var day = readLine()!!.toInt()


    when (day){
        1 -> println("saturday")
        2 -> println("sunday")
        3 -> println("monday")
        4 -> println("tuesday")
        5 -> println("wednesday")
        6 -> println("thursday")
        7 -> println("friday")

        else ->{
            println("invalid day")
        }

    }
}