fun main() {
    print("Enter a number: ")
    val n = readLine()!!.toInt()

    var i = 1
    while (i <= 10) {
        println("$n x $i = ${n * i}")
        i++
    }
}
