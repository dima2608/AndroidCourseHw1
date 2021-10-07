package main.kotlin.in_out

import kotlin.math.PI
import kotlin.math.pow


fun main() {
    val l = 3F
    val pi = 3.14F
    val r: Float = l / (2 * pi)
    val s = pi * (r.pow(2))
    print(" $r \n $l")
}