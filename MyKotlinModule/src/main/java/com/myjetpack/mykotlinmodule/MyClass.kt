package com.myjetpack.mykotlinmodule
fun main() {
 val myListOfNames = listOf("Ram", "Shyam", "Jodu", "Modhu", "Manasi")
  val found = myListOfNames.filter {
       // it=="Modhu"
      //it.length > 2
      it.startsWith("m", ignoreCase = true) && it.endsWith("i", ignoreCase = true)
    }
    println(found)
}
