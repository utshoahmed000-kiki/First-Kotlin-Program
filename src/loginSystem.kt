fun main (){
    print("enter the username ")
    var username=readln()
    print("enter the password")
    var password=readln()

    if(username == "admin"){
        if (password =="1234"){
            println("access granted")
        }
        else{
            println("wrong password")
        }


    }

    else {
        println("unknown user")
    }

}