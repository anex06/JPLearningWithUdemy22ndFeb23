package com.myjetpack.mykotlinmodule

fun main() {
    calculate(1, 50, 6, "is multiple of")
    calculate(message = "hey here is the match", multipleOf = 4)
}

fun calculate(
    start: Int=10,//(named argument) default value  and it can be
    // overrided like first calling method in the above
    end: Int=200,//(named argument) default value
    multipleOf: Int,
    message: String
) {
    for (i in start..end) {
        if (i % multipleOf == 0) {
            println("$i $message $multipleOf")
        } else {
            println("-----")
        }
    }
}
