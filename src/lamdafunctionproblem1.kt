//Write a lambda that takes two numbers and returns their sum.
//Call it and test: 5 + 7 → 12

fun main (){
    val sum :(a:Int,b:Int)->Int={a,b->a+b}
    println(sum(10,20))

}