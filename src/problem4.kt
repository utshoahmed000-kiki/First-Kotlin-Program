//BMI Calculator: Based on a BMI value, print: Underweight (<18.5), Normal (18.5-24.9), Overweight (25-29.9), or Obese (30+).

fun main (){
    print("Enter the value : ")
    var value =readln().toDouble()

    if (value<18.5){
        println("Underweight")
    }
    else if (value >=18.15 && value <=24.9){
        println("Normal")
    }
    else if (value >=25 && value <=29.9){
        println("Overweight")
    }
    else {
        println("Obese")
    }

}