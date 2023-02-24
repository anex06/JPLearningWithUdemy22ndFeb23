package com.myjetpack.mykotlinmodule
fun main() {

    val listOfName = listOf("Anup","Riz")
    listOfName.forEach {
        println("Name : $it")
    }

    val mutableList = mutableListOf(12, 16, 22, 40)
    mutableList.add(2)
    mutableList.forEach{
        println("Integer : $it")
    }

    mutableList.removeAt(2)
    mutableList.forEach{
        println("New Integer list : $it")
    }
}
