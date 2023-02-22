package com.myjetpack.mykotlinmodule

fun main(){
    calculate(700, 1000)
}

fun calculate(a: Int, b: Int) {
  for (i in a..b){
      if (i%2 ==0){
          println("$i is divisible by 2")
      }else{
          println("-----")
      }
  }
}
