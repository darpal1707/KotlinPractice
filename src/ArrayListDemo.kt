fun main(){

    println("Arraylist Demo")

    val arrayList = ArrayList<String>()
    do{
        print("Enter the data or write exit to leave: ")
        val data = readLine()!!.toString()
        if (data!= "exit") {
            arrayList.add(data)
        }
    }while (data != "exit")
   /* for (i in 0 until sizeData){
        print("Enter the data at $i: ")
        arrayList.add(readLine()!!.toString())
    }*/
    println("***************** Data uses Index")
    for (i in 0 until arrayList.size){
        println("The data you entered at $i is: ${arrayList[i]} ")
    }

    println("***************** Data uses Objects")
    for (i in arrayList){
        println("The data you entered is: $i")
    }

}