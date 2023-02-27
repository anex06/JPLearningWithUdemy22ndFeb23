package com.myjetpack.mykotlinmodule

import java.awt.Color

fun main() {
 val car= Car(color = "Green", model = "LLLL")
    val secondCar = Car(color = "Yellow", model = "Audi")
    println("First Car color is ${car.color} and model is ${car.model}")
    println("Second Car color is ${secondCar.color} and model is ${secondCar.model}")
   // println(car.drive())
}

class Car(//Can be changed later like above
    val color: String = "Black"/*Default value*/, val model: String = "BMW"/*Default value*/){

    fun drive() {
        println("Driving the car....")
    }
}