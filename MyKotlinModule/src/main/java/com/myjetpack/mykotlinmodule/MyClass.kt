package com.myjetpack.mykotlinmodule
fun main() {
 val car= Car()
    car.color="Blue"
    println("Car color is ${car.color} and model is ${car.model}")
    println(car.drive())
}

class Car{
    var color: String = "Red"//Can be changed later like above
    val model: String="XMDB"

    fun drive() {
        println("Driving the car....")
    }
}