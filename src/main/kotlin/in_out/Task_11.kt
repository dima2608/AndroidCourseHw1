package main.kotlin.in_out

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val a = 3F
    val b = 4F
    val c = sqrt(a. pow(2) + b.pow(2))
    print("c = $c\n")
    print("P = ${a + b + c}")
}