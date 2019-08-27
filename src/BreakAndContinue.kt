fun main(){
    println("Continue example")
    for (num in 1..10){
        if (num == 6 || num == 5)
            continue
        println("num is: $num")
    }


    println("Break example")
    for (number in 1..10){
        if (number == 2)
            break
        println("num is $number")
    }

    println("Break Inner Example")
    loop@ for (num in 1..10){
        println("number: $num")
        for(innerloop in 1..7){
            println("innerLoop: $innerloop")                        // this will break the inner loop, not the loop outside it
            if(innerloop == 6){                                     // to break outside loop give a label to the outer for loop
                break@loop                                          // and then assign that label to break
            }                                                       // but will run the inner loop completely
        }
    }
}