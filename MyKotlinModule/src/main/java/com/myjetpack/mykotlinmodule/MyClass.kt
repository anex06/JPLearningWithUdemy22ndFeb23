package com.myjetpack.mykotlinmodule

import java.awt.Color

fun main() {
 val car= Car(color = "Green", model = "LLLL")
    val secondCar = Car(color = "Yellow", model = "Audi")
    println("First Car color is ${car.color} and model is ${car.model}")
    //println("Second Car color is ${secondCar.color} and model is ${secondCar.model}")
   println(car.drive())
    car.speed(80, 140)
}

class Car(//Can be changed later like above
    var color: String = "Black"/*Default value*/, var model: String = "BMW"/*Default value*/){

    //init to initialize the value
    init {
        color = "White"
        model = "Mahindra"
    }

    fun speed(minSpeed: Int, maxSpeed: Int){
        println("Min speed is $minSpeed and max speed is $maxSpeed")
    }
    fun drive() {
        println("Driving the car....")
    }
}