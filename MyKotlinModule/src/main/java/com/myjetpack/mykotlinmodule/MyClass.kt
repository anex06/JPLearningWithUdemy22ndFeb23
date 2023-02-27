package com.myjetpack.mykotlinmodule

fun main() {
 println("Hello dear " .append("friend"))
 println("Indiana".removeFirstLastChar())
}

//Extension function
fun String.append(toAppend: String): String = this.plus(toAppend)

fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)