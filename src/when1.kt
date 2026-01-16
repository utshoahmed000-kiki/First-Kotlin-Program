fun main (){

    print("Enter the grade(A,B,C,D,F)")
    val grade = readLine()!!

    when (grade){
        "A"-> println("Excellent")
        "B"-> println("Good")
        "C"-> println("Average")
        "D"-> println("Pass")
        "F"-> println("Fail")
        else -> println("Invalid Grade")
    }


}