fun main(){
    for(i in 1..100){
        if(i % 2 == 0){
            println("value in i : $i ")
        }
    }

    // instead of doing like above another way is

    for(i in 1..100 step 3){
        println("i: $i")
    }

    // for upside down loop you can write like this
    for(i in 100 downTo 0){
        println("i: $i")
    }
}