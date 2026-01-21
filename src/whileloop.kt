fun main() {
    print("Enter a number: ")
    var n = readLine()!!.toInt()

    var reverse = 0

    while (n != 0) {
        val digit = n % 10
        reverse = reverse * 10 + digit
        n /= 10
    }

    println("Reversed number = $reverse")
}
