package com.myjetpack.mykotlinmodule
fun main() {
    // If the last parameter is a function then don't need to add the function as a parameter
    enhancedMessage("Hello"){
        println(it)
        12
    }
}

//Trailing lambda where the last parameter needs to be the function
fun enhancedMessage(message: String, funAsParameter : (String) -> Int){
    println("$message ${funAsParameter("Hi ")}" )
}
