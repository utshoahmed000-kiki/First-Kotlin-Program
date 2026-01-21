fun main() {
    print("Enter a number: ")
    var n = readLine()!!.toInt()

    var sum = 0

    while (n != 0) {
        val digit = n % 10
        sum += digit
        n /= 10
    }

    println("Sum of digits = $sum")
}
