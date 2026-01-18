//Write a lambda to check if a number is even
fun main (){
    val isEven: (Int)->Boolean={a -> a % 2==0 }
    println(isEven(10))

}