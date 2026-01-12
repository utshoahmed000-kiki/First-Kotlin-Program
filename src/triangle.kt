//Triangle Validity: Given three angles, check if they form a valid triangle (sum must be 180).

fun main (){

    print("enter the 1st number ")
    var a=readln().toInt()
    print("enter the 2nd number ")
    var b=readln().toInt()
    print("enter the 3rd number ")
    var c=readln().toInt()

    if(a>0 && b>0 && c>0 ){
        if(a+b+c==180){
            println("valid triangle")
        }
        else{
            println("invalid triangle")
        }
    }
    else{
        println("invalid triangle")
    }



}

