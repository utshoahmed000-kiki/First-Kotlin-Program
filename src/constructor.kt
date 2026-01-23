class Carr(val colour: String, val model: String) {

    fun drive() {
        println("Car Is Running")
    }
}
fun main() {

    print("Enter Carr colour: ")
    val userColour = readLine()!!

    print("Enter Carr model: ")
    val userModel = readLine()!!

    val myCarr = Carr(userColour, userModel)

    println("Car Colour: ${myCarr.colour}")
    println("Car Model: ${myCarr.model}")

    myCarr.drive()
}
