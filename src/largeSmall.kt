fun main (){
    print("Enter the first number : ")
    var num1 = readln().toInt()
    print("Enter the second number : ")
    var num2=readln().toInt()


    if(num1>num2){
        println("$num1 num1 is largest")

    }

    else if (num1==num2){
        println("$num1 and $num2 is equal")
    }
   else {
       println("$num2 num2 is largest")
   }

}