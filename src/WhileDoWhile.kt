fun main(){

    println("For Loop")
    for (i in 1..10 step 1){
        println("i: $i")
    }

    println("While Loop")
    var j=1
    while (j<=10){
        println("j: $j")
        j++
    }

    println("Do while Loop")
    var k=1
    do{
        println("k: $k")
        k++
    }while (k<=10)

}