class StudentAccount (
    private val studentId: String,

    private val studentName: String,
    private val passwordPin: Int
)
{
    private var accountBalance = 0.0
    fun viewbalance(){
        println("Student Name: $studentName")
        println("Current Balance: $accountBalance")
    }
    fun SaveMoney(amount: Double){
        if (amount>0){
            accountBalance +=amount
            println("Save $amount Successfully")
            println("New balance: $accountBalance")
        }
        else {
            println("Invalid save Money")
        }
    }
    fun spendMoney(amount: Double){
        if (amount>0 && amount<= accountBalance){
            accountBalance -= amount
            println("Spend $amount Successfully")
            println("Remaing Balance: $accountBalance")
        }
        else {
            println("Insufficient Amount")
        }
    }

}

fun main (){
    val student= StudentAccount(
        studentId= "UT6848",
        studentName= "Utsho",

        passwordPin= 6848
    )
    println("initial Balance")
    student.viewbalance()
    println("saving Money")
    student.SaveMoney(5000.0)
    println("Spending Money")
    student.spendMoney(3000.0)
    println("Last Balance")
    student.viewbalance()


}