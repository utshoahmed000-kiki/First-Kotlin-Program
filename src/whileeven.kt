fun main() {
    print("Enter a number: ")
    val n = readLine()!!.toInt()

    var i = 1
    while (i <= n) {
        if (i % 2 == 0) {
            print("$i ")
        }
        i++
    }
}
