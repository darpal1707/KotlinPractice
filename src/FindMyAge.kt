import java.util.*

fun main(){

    print("Enter your year of birth: ")
    val yearOfBirth = readLine()!!.toInt()
    val systemYear = Calendar.getInstance().get(Calendar.YEAR)
    val age = systemYear - yearOfBirth
    println("You are $age year old!")


}