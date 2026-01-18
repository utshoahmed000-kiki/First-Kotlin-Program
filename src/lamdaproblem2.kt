//Write a lambda that takes two integers and returns their sum
fun main (){
    val sum:(Int,Int)->Int={x,y->x+y}
    println(sum(10,20))
}