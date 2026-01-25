open class Game (){
    fun pubg (){
        println("Playing pubg")
    }
}

class Games : Game(){
    fun freefire (){
        println("Playing freefire")
    }
}
fun main (){

    val s = Games()
    s.pubg()
    s.freefire()


}