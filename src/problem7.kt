//Vote Eligibility: Given an age, check if a person is eligible to vote (18 or older).
fun main(){
    println("Enter the age : ")
    var age =readln().toInt()

    if(age>=18){
        println("Person is eligible to vote")
    }
    else {
        println("Person is not eligible to vote")
    }

}