package com.myjetpack.mykotlinmodule
fun main() {
 Repository.startFetch()
 getResult(Repository.getCurrentState())
 Repository.finishedFetch()
 getResult(Repository.getCurrentState())
}

fun getResult(result: Result){
 when(result){
  is Error -> {
   println(result.exception.toString())
  }
  is Success -> {
   println(result.dataFetched?: "Ensure you start the fetch function first")
  }
  is Loading -> {
   println("Loading..")
  }
  is NotLoading -> {
   println("Idle")
  }
  else -> {
   println("Not available")
  }
 }
}


abstract class Result
//if we want to pass data as param then use data class
data class Success(val dataFetched: String?): Result()
data class Error(val exception: Exception): Result()
//if do not want to pass the data then use object
object NotLoading: Result()
object Loading: Result()

//object keyword to create Singleton class. We don't need to create an object to access it
object Repository{
 private var loadState: Result = NotLoading
 private var dataFetched : String? = null

 fun startFetch(){
  loadState = Loading
  dataFetched = "data"
 }

 fun finishedFetch(){
  loadState = Success(dataFetched)
  dataFetched = null
 }

 fun error(){
  loadState = Error(Exception("Exception"))
 }

 fun getCurrentState() : Result{
  return loadState
 }
}

/*enum class Result{
 SUCCESS,
 FAILURE,
 ERROR,
 IDLE,
 LOADING
}*/
