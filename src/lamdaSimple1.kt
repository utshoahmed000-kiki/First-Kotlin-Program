
fun main (){

    val add ={x:Int,y:Int ->x-y}
    val sum=calculate(30,20, add)
    println(sum)

}
fun calculate(a:Int,b:Int, operation :(Int,Int)->Int):Int{
    return operation(30,20)
}
