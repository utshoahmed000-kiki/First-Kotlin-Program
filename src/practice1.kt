fun main (){

    val employees=readLine()!!.toInt()
    val workperhour=readLine()!!.toInt()
    val salaryy=readLine()!!.toDouble()

    val salary=workperhour*salaryy
    println("NUMBER = $employees")
    println("SALARYY = U$ %.2f".format(salary))




}