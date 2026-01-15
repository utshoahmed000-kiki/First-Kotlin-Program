fun main() {
    print("Enter a number: ")
    var n = readLine()!!.toInt()

    var count = 0
    var number = n

    while (number != 0) {
        number /= 10
        count++
    }

    println("Number of digits in $n is $count")
}
