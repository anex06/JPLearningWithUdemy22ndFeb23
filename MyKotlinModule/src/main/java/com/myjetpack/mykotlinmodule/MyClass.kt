package com.myjetpack.mykotlinmodule

fun main() {
    println(add(5,7))
    println(catAge(7))
}
// Function definition Using Lambda expression
// val lambda name:(Parameter Type) -> return type = { parameterList -> functionBody}
val add:(Int, Int) ->Int = { a,b -> a+b}

//We can use it if using only one parameter like below
val catAge: (Int) -> Int = {
        it -> it * 7
}