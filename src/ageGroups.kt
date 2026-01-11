fun main (){
    print("Enter the age ")
    var age = readln().toInt()

    if(age<=12){
        println("Child")
    }
    else if(age>=13 && age<=19){
        println("Teenager")
    }
    else if (age>=20 && age<=59){
        println("Adult")
    }
    else {
        println("Senior")
    }


}