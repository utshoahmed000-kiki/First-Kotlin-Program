class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited successfully: $amount")
        } else {
            println("Deposit unsuccessful")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdraw successful: $amount")
        } else {
            println("Withdraw unsuccessful or insufficient funds")
        }
    }

    fun checkBalance() {
        println("Current Balance: $balance")
    }
}

fun main (){
    val bankAccount = BankAccount()
    bankAccount.deposit(100000.0)
    bankAccount.withdraw(50000.0)
    bankAccount.checkBalance()
}