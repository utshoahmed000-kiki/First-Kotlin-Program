fun main() {
    print("Enter a number: ")
    var n = readLine()!!.toInt()

    var temp = n
    var sum = 0

    while (temp > 0) {
        val digit = temp % 10
        sum = sum + (digit * digit * digit)
        temp = temp / 10
    }

    if (sum == n) {
        println("Armstrong Number")
    } else {
        println("Not Armstrong Number")
    }
}
