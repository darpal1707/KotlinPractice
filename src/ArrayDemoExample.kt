fun main(){
    print("Enter the size of the array: ")
    val arraySize = readLine()!!.toInt()
    val arrayList: Array<Int> = Array(arraySize){0}
    for (i in 0 until arraySize){                           // until -- arraySize-1 (that means it goes till 1 size less than the array size
        print("Enter the $i value: ")
        arrayList[i] = readLine()!!.toInt()
    }
    println("The data inside array are: ")
    for (i in 0 until arraySize){
        println("Data at $i is: ${arrayList[i]}")
    }
}