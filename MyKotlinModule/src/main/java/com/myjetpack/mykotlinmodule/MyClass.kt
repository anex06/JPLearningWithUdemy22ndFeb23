package com.myjetpack.mykotlinmodule

fun main() {

 val listOfItems = listOf("Ram", "Sita", "Laxman")
 val listOfNumbers = listOf(1,2,3,4,5,6)
 val finder = Finder(listOfItems)
 finder.findItem(""){
  println("Found string $it")
 }
 val finderInt = Finder(listOfNumbers)
 finderInt.findItem(30){
  println("Found integer $it")
 }
}

//Generic class "T" is the type
class Finder<T>(private val list: List<T>){
 fun findItem(element: T, foundItem:(element: T?) -> Unit){
  val itemFoundInList = list.filter {
   it == element
  }
  if (itemFoundInList.isEmpty())
   foundItem(null)
  else
   foundItem(itemFoundInList.first())
 }
}