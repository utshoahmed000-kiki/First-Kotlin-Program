fun main (){

    print("Enter the number : ")
    var num1 = readLine()!!.toInt()


    for (num2 in 1.. num1 step 1 ){

        if (num2 % 2==0){
            println("$num2 is even")
        }
        else {
            println("$num2 is odd")
        }



    }

}