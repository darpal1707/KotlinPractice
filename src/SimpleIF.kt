fun main(){
    print("Enter your grade: ")
    val grade = readLine()!!.toInt()

    if(grade>90){
        println("A grade")
    } else if (grade>80 && grade<90){
        println("Grade B")
    } else if (grade in 71..79){               //another way to have a Range check instead of long code
        println("Grade C")
    } else if (grade in 60..69){
        println("Grade D")
    }else{
        println("Fail")
    }
}