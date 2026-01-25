open class Desktop (){
    fun pc (){
        println("This is pc")
    }

}

 open class IOS : Desktop() {
    fun apple(){
        println("This is apple")
    }
}

class Android : IOS() {
    fun phone (){
        println("This is phone")
    }
}
fun main (){
    val a=Android()
    a.pc()
    a.apple()
    a.phone()

}