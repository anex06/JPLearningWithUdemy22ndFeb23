package com.myjetpack.mykotlinmodule
fun main() {
    //Set
    val mySet = mutableSetOf(1,2,3,4)
    //Set can hold only unique data item if I add same value
    //then the value will not be added
    mySet.add(3)//This value will not be added as it is not unique to the set
    mySet.add(21)
    println(mySet)

    //Map
    val secretMap= mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    println(secretMap)
    println(secretMap.keys)
    println(secretMap.values)
    if ("key1" in secretMap) println("Yes key is available")
    else println("Key is not available")
    if (3 in secretMap.values) println("Yes value is available")

    //Mutable map
    val myMutableMap = mutableMapOf("A" to 12, "B" to 32, "C" to 40)
    println(myMutableMap)
    myMutableMap["D"] = 55
    println("After adding in map $myMutableMap")

}
