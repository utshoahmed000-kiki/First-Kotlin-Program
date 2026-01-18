//Write a lambda that takes a String and returns its length

fun main (){
    val stringLength : (String)->Int={ a -> a.length}
    println(stringLength("Utsho"))

}