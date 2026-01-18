fun main (){



calculator(10,20,::sum)

}
fun sum (a:Int,b:Int):Int{
    return a+b
}

fun calculator (a:Int,b:Int, operation:(Int,Int)->Int){
    val result = operation(a,b)
    println(result)
}