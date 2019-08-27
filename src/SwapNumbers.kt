fun main(){
    var x:Int = readLine()!!.toInt()
    var y:Int = readLine()!!.toInt()

    println("Before swapping")
    println("x= $x")
    println("y= $y")

    var temp = x
    x = y
    y = temp

    println("After swapping")
    println("x= $x")
    println("y= $y")

}