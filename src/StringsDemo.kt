fun main(){
    val str1 = "Welcome to Kotlin Programming!"
    val str2 = "Hello Darpal"
    val strconcat = "$str2,$str1"                   //String concat - Adding two strings into one
    println(strconcat)

    println(strconcat[2])                           //Printing the letter at a particular position
    println(strconcat.toLowerCase())                //Print everything to lowercase
    println(strconcat.toUpperCase())                //Print everything to Uppercase
    println(strconcat.trim())                       //Print message without blank spaces before or after the message

    val tokens = str1.trim().split(" ")   //Splitting the message into each words
    for (i in tokens){
        println("token: $i")
    }
}