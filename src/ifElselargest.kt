fun main() {
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()

    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()

    if (num1 > num2) {
        println("The larger number is: $num1")
    } else if (num2 > num1) {
        println("The larger number is: $num2")
    } else {
        println("Both numbers are equal: $num1")
    }
}
