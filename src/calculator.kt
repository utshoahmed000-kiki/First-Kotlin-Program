fun main() {
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()

    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()

    print("Enter operator (+, -, *, /): ")
    val op = readLine()!!

    val result = when (op) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) num1 / num2 else {
                println("Error: Division by zero")
                return
            }
        }
        else -> {
            println("Invalid operator")
            return
        }
    }

    println("Result = $result")
}
