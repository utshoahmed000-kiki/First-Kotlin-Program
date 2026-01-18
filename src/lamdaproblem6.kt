//Write a lambda that checks whether a number is positive or negative

fun main (){

    print("Enter the number : ")
    val num=readLine()!!.toInt()



  println(check(num))

}
val check :(Int)->String = {a->
    if (a>0){
      ("positive")
    }
    else if (a<0){
       ("negative")
    }
    else {
        ("invalid")
    }
}