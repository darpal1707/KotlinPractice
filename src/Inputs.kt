fun main(){
    val name:String = readLine().toString()
    val age:Int = readLine()!!.toInt()        //!! means the value wont be null
    val GPA:Double = readLine()!!.toDouble()

    println("Your Name: $name")
    println("Your Age: $age")
    println("Your GPA: $GPA")

}