//Write a lambda that takes one number
//Returns true if the number is even, otherwise false

fun main (){
    val isEven:(a:Int)->Boolean={a->a%2==0}
    println(isEven(6))
    println(isEven(3))
}