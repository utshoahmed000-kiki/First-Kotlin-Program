fun main(){

    print("Enter the number : ")
    var num1 = readln().toInt()

    var num2 =1

    while (num2<=num1 ) {

        if (num2 % 2 == 0) {
            println("$num2 is Even")
        } else {
            println("$num2 is odd")

        }

        num2++
    }



}