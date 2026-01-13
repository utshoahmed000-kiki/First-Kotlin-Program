//Temperature Advice: Input temperature in Celsius: <0 (Freezing), 0-15 (Cold), 16-30 (Warm), 31+ (Hot).

fun main (){

    print("Enter the number : ")
    var temp=readln().toInt()


    if (temp<0){
        println("Freezing")
    }
    else if (temp>=0 && temp <=15){
        println("Cold")
    }
    else if (temp>=16 && temp<=30){
        println("Warm")
    }
    else {
        println("Hot")
    }

}