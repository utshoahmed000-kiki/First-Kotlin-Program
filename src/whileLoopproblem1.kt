//Write a Kotlin program that prints all even numbers between 1 and 20 using a while loop.

fun main (){

    var a=1
     while (a<=20){
         if(a%2==0){
             println("$a")
         }
         a++
     }

}