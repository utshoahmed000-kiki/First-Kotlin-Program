fun main() {
    print("Enter a number: ")
    var n = readLine()!!.toInt()

    var temp = n
    var reverse = 0

    while (temp > 0) {
        val digit = temp % 10
        reverse = reverse * 10 + digit
        temp = temp / 10
    }

    if (reverse == n) {
        println("Palindrome Number")
    } else {
        println("Not Palindrome Number")
    }
}
