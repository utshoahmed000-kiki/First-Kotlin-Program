fun main (){

    val name = readLine()!!
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()

    val bonus = b*0.15
    val totalsalary=a+bonus
    println("TOTAL = R$ %.2f".format(totalsalary))


}