class EmployeeAccount(
    private val employeeId: String,
    private val employeeName:String,
    private var basicSalary:Double,
    private var performanceRating:Int
    )
{
    fun viewSalaryDetails(){
        println("Employee Name: $employeeName")
        println("Basic Salary: $basicSalary")
    }
    fun addBonus(){
        if (performanceRating==5){
            val bonus= basicSalary*0.10
        basicSalary+=bonus
        println("Add Bonus: $bonus")
        }
        else {
            println("No Bonus Added")
        }
    }
    fun deductTax(percentage: Double){
        val taxAmount= basicSalary*(percentage/100)
            basicSalary -= taxAmount
        println("Deducted Tax: $taxAmount")
    }
}
fun main (){
    val employee= EmployeeAccount(
        employeeId = "6848",
        employeeName = "Senior",
        basicSalary = 20000.0,
        performanceRating=5
    )
    println("--------Initial Salary Details-----")
    employee.viewSalaryDetails()
    println("--------Applying Bonus-----")
    employee.addBonus()
    println("-----------Deducting Tax-----------")
    employee.deductTax(15.0)
    println("----------Final Salary-------- ")
    employee.viewSalaryDetails()
}