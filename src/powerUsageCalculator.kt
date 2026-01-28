abstract class Appliance{
    abstract fun calculatePowerUsage()
}

class Fan:Appliance(){
    override fun calculatePowerUsage(){
        val watts=88
        val hours = 18
        val kwh=watts*hours/1000.0
        println("Fan consume $kwh kwh")
    }
}
class Airconditioner:Appliance(){
    override fun calculatePowerUsage(){
        val watts=1800
        val hours = 15
        val kwh=watts*hours/1000.0
        println("Airconditioner consume $kwh kwh")
    }
}
class LightBulb:Appliance(){
    override fun calculatePowerUsage(){
        val watts=20
        val hours = 18
        val kwh=watts*hours/1000.0
        println("Lightbulb consume $kwh kwh")
    }
}

fun main (){

    val fan= Fan()
    val airconditioner= Airconditioner()
    val lightBulb= LightBulb()
    fan.calculatePowerUsage()
    airconditioner.calculatePowerUsage()
    lightBulb.calculatePowerUsage()
}