//Number of Digits: Check if a positive number has 1, 2, 3, or "more than 3" digits.

fun main (){
    print("Enter the number : ")
    var num=readln().toInt()

    if (num>=0 && num<=9){
        println("This number is 1 digits")
    }
    else if (num>=10 && num<=99){
        println("This number is 2 digits")
    }
    else if (num>=100 && num<=999){
        println("This number is 3 digits")
    }
    else {
        println("This number is more than 3 digits")
    }

}