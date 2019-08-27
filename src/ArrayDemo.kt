fun main(){
    println("Array Example")

    val listOfData:Array<String> = Array(3){""}
    for (i in 0..listOfData.size-1){
        print("Enter the data here: ")
        listOfData[i] = readLine()!!.toString()
    }
    println("**** Data inside array **** ")
    for (i in 0..listOfData.size-1){
        println("Data at $i is: ${listOfData[i]}")
    }
}