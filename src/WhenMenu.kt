fun main(){
    print("Pick a Food item from the menu: ")
    val foodId = readLine()!!.toInt()
    when(foodId){
        1 ->
            println("You selected Burger")
        2 ->
            println("You selected Sandwich")
        3 ->
            print("You selected Sushi")
        4 ->
            println("You selected Salad")
        else ->
            println("Menu is over")
    }
}