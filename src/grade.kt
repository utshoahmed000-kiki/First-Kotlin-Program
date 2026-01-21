fun main() {
    print("Enter your mark (0-100): ")
    val mark = readLine()!!.toInt()

    val grade = when (mark) {
        in 80..100 -> "A+"
        in 70..79  -> "A"
        in 60..69  -> "A-"
        in 50..59  -> "B"
        in 40..49  -> "C"
        in 0..39   -> "Fail"
        else       -> "Invalid mark"
    }

    println("Your grade: $grade")
}
