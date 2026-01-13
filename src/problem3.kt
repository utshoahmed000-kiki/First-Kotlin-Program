//Age Groups: Categorize a person based on age: 0-12 (Child), 13-19 (Teenager), 20-59 (Adult), 60+ (Senior).

fun main (){

    print("Enter the age : ")
    var age =readln().toInt()

    if (age >=0 && age <=12){
        println("Child")
    }
    else if (age >=13 && age <=19){
        println("Teenager")
    }
    else if (age >=20 && age <=59){
        println("Adult")
    }
    else {
        println("Senior")
    }

}