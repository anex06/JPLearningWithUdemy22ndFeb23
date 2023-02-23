package com.myjetpack.mykotlinmodule

fun main() {
  name("Anup")
}

//Unit in kotlin is treated as void
val name:(String) -> Unit={
   print("Hello my name is $it")
}