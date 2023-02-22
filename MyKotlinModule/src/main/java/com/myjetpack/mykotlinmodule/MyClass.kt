package com.myjetpack.mykotlinmodule

fun main() {
    calculate(1, 100, 6, "is multiple of")
}

fun calculate(
    start: Int,
    end: Int,
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
