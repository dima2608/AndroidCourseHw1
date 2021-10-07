package main.kotlin.in_out

import kotlin.math.sqrt

fun main() {
    val s = 4.5F
    val pi = 3.14F

    val r = sqrt(s * pi)
    val d = 2 * r
    val l = 2 * pi * r

    print(" $d \n $l")
}