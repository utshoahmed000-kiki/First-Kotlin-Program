class Bike (){
    val colour="Green"
    val model="Ninza h2r"
    fun drive(){
        println("Bike Is Running")
    }
}

fun main (){
    val myBike = Bike()

    println(myBike.model)
    println(myBike.colour)
    myBike.drive()
}