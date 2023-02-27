package com.myjetpack.mykotlinmodule

fun main() {
 val person1 = Person(
 "Anup sarkar",
  32,
"Kolkata"
 )
 val person2 = Person("Phoring", 23, "Birpur")

 val listOfPeople = listOf(person1, person2)
 listOfPeople.forEach { person->
  println(person.age)
 }

}

//Data class is a simple class which is used to hold data/state and contains standard functionality.
data class Person(val name: String, val age: Int, val address: String)