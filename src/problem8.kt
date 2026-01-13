//Triangle Validity: Given three angles, check if they form a valid triangle (sum must be 180).

fun main (){
    print("Enter the first number : ")
    var first=readln().toInt()
    print("Enter the second number : ")
    var second=readln().toInt()
    print("Enter the third number : ")
    var third=readln().toInt()

    if (first+second+third==180){
        println("Valid Triangle")
    }
    else {
        println("Invalid Triangle")
    }

}