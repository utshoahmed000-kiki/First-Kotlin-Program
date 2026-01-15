//Write a Kotlin program that takes a number from the user and prints its multiplication table up to 10 using a while loop.

fun main (){
    print("Enter the number : ")
    var num=readLine()!!.toInt()


    var a=1
    while (a<=10){

        var b=num*a
        println("$num* $a =$b")
        a++

    }

}