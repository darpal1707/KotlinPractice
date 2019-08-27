fun main(){
    for(i in 1..10){
        print("Enter your name: ")
        val name = readLine()!!.toString()
        print("Where you live: ")
        val live = readLine()!!.toString()
        var petName:String?= ""
        print("Enter number of pets: ")
        val petCount = readLine()!!.toInt()
        for (j in 1..petCount){
            print("Enter Pet $j: ")
            petName = petName + readLine()!!.toString() + ","
        }

        println("***** user info *****")
        println("Name: $name")
        println("Place: $live")
        println("Pet Name: $petName")
    }
}