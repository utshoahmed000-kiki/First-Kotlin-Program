fun main() {
    print("Enter a character: ")
    val ch = readLine()!!.lowercase()[0]  // lowercase করে নিই

    when (ch) {
        'a', 'e', 'i', 'o', 'u' -> println("Vowel")
        in 'a'..'z' -> println("Consonant")
        else -> println("Invalid input")
    }
}
