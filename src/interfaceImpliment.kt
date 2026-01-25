interface Grandfather {
    fun a (){
        println("This is my grandfather")
    }
}
interface Dad {
    fun b(){
        println("This is my dad")
    }
}

class Son : Grandfather,Dad {
    override fun a(){
        println("This is me")


    }
    override fun b(){
        println("This is me my dad's son")
    }

}
fun main (){

    val s= Son()
    s.a()
    s.b()

}