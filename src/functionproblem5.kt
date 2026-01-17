/*Write a function that:
takes one integer
returns true if the number is even
returns false if the number is odd*/
fun main (){

    println(evenOdd(10))
    println(evenOdd(11))

}

fun evenOdd(n:Int):Boolean{
    return n%2==0
    }

