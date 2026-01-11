fun main(){
    println("enter the number")
    var a = readLine()!!.toInt()

    var b = 1

    while (b<=a){
        if (b%2==0){
            println("$b - even")


        }
        else {
            println("$b - odd")
        }

        b++



    }







}