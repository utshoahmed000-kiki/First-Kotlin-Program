fun main() {



    val input = readLine()!!.split(" ")

    val accountType = input[0]
    val balance = input[1].toDouble()
    val amount = input[2].toDouble()
    val pinCorrect = input[3].toInt()
    val time = input[4].toInt()

    var finalBalance = balance
    var reason = ""


    if (pinCorrect != 1) {
        reason = "Incorrect PIN"
    }
    else if (amount <= 0) {
        reason = "Invalid withdrawal amount"
    }
    else if (amount > balance) {
        reason = "Insufficient balance"
    }

    else if (accountType == "S") {

        val minimumBalance = 500.0
        val officeStart = 9
        val officeEnd = 17
        val charge = if (time < officeStart || time > officeEnd) 50.0 else 0.0

        if (balance - amount - charge < minimumBalance) {
            reason = "Minimum balance rule violated for Savings Account"
        } else {
            finalBalance = balance - amount - charge
        }

    }
    else if (accountType == "C") {

        val minimumBalance = 1000.0
        var tax = 0.0

        if (amount > 50000) {
            tax = amount * 0.10
        }

        if (balance - amount - tax < minimumBalance) {
            reason = "Minimum balance rule violated for Current Account"
        } else {
            finalBalance = balance - amount - tax
        }

    }
    else {
        reason = "Invalid account type"
    }


    if (reason.isEmpty()) {
        println("Transaction Successful")
        println("Remaining Balance: %.2f".format(finalBalance))
    } else {
        println("Transaction Failed: $reason")
    }
}
