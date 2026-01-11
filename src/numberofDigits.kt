fun main(){
    print("Enter the number ")
    var num=readln().toInt()


    if (num>=0 && num<=9){
        println("1 digit")
    }
    else if (num>=10 && num <= 99){
        println("2 digits")
    }
    else if (num>=100 && num<=999){
        println("3 digits")
    }
    else {
        println("more than 3 digits")
    }


}