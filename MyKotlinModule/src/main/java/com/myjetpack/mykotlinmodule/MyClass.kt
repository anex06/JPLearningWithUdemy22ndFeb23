package com.myjetpack.mykotlinmodule

fun main(){
  val amount = 100
    for (i in 1..1000){
        if (i%3 == 0){
            println("$i is divisible by 3")
        }else{
            println("----")
        }
    }
   /* when(amount){
        in 1..100 -> print("You are very poor..")
        !in 10..90 -> print("Amount is outside the range")
        in 101..200 -> print("Try hard..")
        500 -> print("Not bad try more")
        in 500..900 -> print("Getting there")
        in 901..1000 -> print("You are little far from being a rich person")
        else ->{
            print("$amount is just not going to work")
        }

    }*/
}