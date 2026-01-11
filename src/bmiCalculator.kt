fun main (){
    print("Enter the number ")
    var num =readln().toDouble()

    if (num <=18.5){
        println("Underweight")
    }
    else if (num>=18.5 && num <=24.5){
        println("Normal")
    }
    else if (num>=25 && num <=29.9)
        println("Overweight")

    else {
        println("Obese")
    }


}