fun main(){
    val str = "Hello! trying the variable in kotlin\t"     //val can automatically switch to any datatype based on the value assigned
    println(str)
    println(str + "Good Luck Darpal!")

    val name:String                 //if you are not planning to assign value at the beginning do this way
    name = "another method."
    println(name)

    var fullname:String = "Darpal Dhyani"
    val age: Int = 25
    val GPA: Float = 3.85F

    println("----- My Details -----")
    println("Name: $fullname")        // the way to print values assigned to a variable
    println("Age: $age")
    println("GPA: $GPA")


    //if you assign any values as a "val" -- its read only
    //if you assign any values as a "var" -- you can change them

    fullname = "Darpal Bhasker Dhyani"
    println("New Full name is: $fullname")

    var departmentName:String? //? means you will provide the value afterwards
    departmentName = null
    departmentName = "Android Developer"
    println("Department Name: ${departmentName}") //this means value cannot be null


}