//Pass/Fail: Given a score (0-100), print "Pass" if it's 50 or above, otherwise print "Fail."

fun main (){

    print("Enter the number : ")
    var score=readln().toInt()


    if (score>=50){
        println("Pass")
    }
    else{
        print("Fail")
    }

}