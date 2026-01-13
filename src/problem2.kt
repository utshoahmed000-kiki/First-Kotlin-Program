//School Grading: Input a score and assign a grade: 90+ (A), 80-89 (B), 70-79 (C), 60-69 (D), below 60 (F).

fun main (){
    print("Enter the score : ")
    var score =readln().toInt()

    if(score >=90){
        println("A")
    }
    else if (score >=80 && score <=89){
        println("B")
    }
    else if (score >=70 && score <=79){
        println("C")
    }
    else if (score >=60 && score <=69){
        println("D")
    }
    else{
        println("F")
    }
}