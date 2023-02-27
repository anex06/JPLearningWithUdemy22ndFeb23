package com.myjetpack.mykotlinmodule

import java.awt.Color

fun main() {
 val car= Car(color = "Green", model = "LLLL")
    val secondCar = Car(color = "Yellow", model = "Audi")
    //println("First Car color is ${car.color} and model is ${car.model}")
    //println("Second Car color is ${secondCar.color} and model is ${secondCar.model}")
   // car.speed(80, 140)
   // println(car.drive())

    //Truck
    val truck = Truck(color = "Magenta", model = "F16")
    println("Trucks color is ${truck.color} and model is ${truck.model}")
    truck.speed(20, 90)
    truck.drive()
}

class Truck(color: String,  model: String) : Car(color, model){
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        super.speed(minSpeed, maxSpeed)
        val truckSpeed = minSpeed*maxSpeed
        println("Truck's full speed is $truckSpeed")

    }

    override fun drive() {
        super.drive()
        println("Truck is driving vrooooooommmm")
    }
}

//By default you can not inherit any class in kotlin.
//To make any class to be inherited by other class you have to add "open" keyword like below
open class Car(//Can be changed later like above
    var color: String = "Black"/*Default value*/, var model: String = "BMW"/*Default value*/){

    //init to initialize the value
//    init {
//        color = "White"
//        model = "Mahindra"
//    }

   open fun speed(minSpeed: Int, maxSpeed: Int){
        println("Min speed is $minSpeed and max speed is $maxSpeed")
    }
   open fun drive() {
        println("Driving the car....vroom vroom")
    }
}