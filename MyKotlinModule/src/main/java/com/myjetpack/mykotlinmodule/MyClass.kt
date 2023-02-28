package com.myjetpack.mykotlinmodule

fun main() {
 Repository.startFetch()
 getResult(Repository.getCurrentState())
 Repository.finishedFetch()
 getResult(Repository.getCurrentState())
}

fun getResult(result: Result){
 when(result){

  Result.SUCCESS -> println("Success!")
  Result.FAILURE -> println("Failure!")
  Result.ERROR -> println("Error!")
  Result.IDLE -> println("Idle!")
  Result.LOADING -> println("Loading..")
 }
}

//object keyword to create Singleton class. We dont need to create an object to access it
object Repository{
 private var loadState: Result = Result.FAILURE
 private var dataFetched : String? = null

 fun startFetch(){
  loadState = Result.LOADING
  dataFetched = "data"
 }


 fun finishedFetch(){
  loadState = Result.SUCCESS
  dataFetched = null
 }

 fun error(){
  loadState = Result.ERROR
 }

 fun getCurrentState() : Result{
  return loadState
 }
}

enum class Result{
 SUCCESS,
 FAILURE,
 ERROR,
 IDLE,
 LOADING
}
