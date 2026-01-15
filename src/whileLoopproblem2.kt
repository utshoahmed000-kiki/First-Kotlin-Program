//Write a Kotlin program that takes an integer n from the user and calculates the sum of numbers from 1 to n using a while loop.

fun main (){
    print("Enter the number : ")
    var n=readLine()!!.toInt()

    var a=1
    var sum=0

    while(a<=n){
        sum+=a
        a++
    }
   println("The sum is $sum")
}