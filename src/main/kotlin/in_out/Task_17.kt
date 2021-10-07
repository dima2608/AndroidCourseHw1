package main.kotlin.in_out

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val x1 = 7F
    val y1 = 6F
    val x2 = 5F
    val y2 = 5F

    val l = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))

    println("$l")
}