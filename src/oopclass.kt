fun main (){

    val lamborgini = Car(name = "Lamborgini",color = "blue",price = 99.99)
    val bugatti= Car(name = "Bugatti",color = "orange",price = 100.99)

    println(lamborgini.name)
    println(lamborgini.color)
    println(lamborgini.price)

    lamborgini.drivecar()

}
class Car (val name:String,val color:String,var price:Double)//properties
{
    fun drivecar(){//methods
        println("Drive the car")
    }

    fun appybreaks(){
        println("Appy breaks")
    }
}
