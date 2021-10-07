package main.kotlin.in_out

import kotlin.math.abs

fun main() {
    val a = 3.0F
    val b = 2.1F
    val c = 5.9F

    val k = abs( c - a)
    val l = abs(c - b)
    val f = k + l

    print("$k\n$l\n$f")
}