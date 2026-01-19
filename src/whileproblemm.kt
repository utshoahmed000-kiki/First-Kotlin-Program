fun main() {
    print("Enter a number: ")
    var n = readLine()!!.toInt()

    var count = 0

    while (n != 0) {
        n = n / 10
        count++
    }

    println("Digits = $count")
}
