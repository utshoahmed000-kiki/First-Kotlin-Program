fun main (){
    val input1=readLine()!!.split(" ")
    val t=input1[0].toInt()
    val a=input1[1].toInt()
    val b=input1[2].toDouble()

    val input2=readLine()!!.split(" ")
    val s=input2[0].toInt()
    val c=input2[1].toInt()
    val d=input2[2].toDouble()


    val amountpaid= (a*b)+(c*d)
    println("VALOR A PAGAR: R$ %.2f".format(amountpaid))


}