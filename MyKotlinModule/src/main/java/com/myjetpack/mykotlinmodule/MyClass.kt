package com.myjetpack.mykotlinmodule

fun main() {
    val button = Button(label = "My button")
    button.onClick("Hello there")
}

class Button(val label: String) : ClickEvent{
    override fun onClick(message: String) {
        println("Clicked by $label and here is the message $message")
    }

}
//Interface (will be implemented at class level) and class can implement it
interface ClickEvent{
    fun onClick(message: String)
}
