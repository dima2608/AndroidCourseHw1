package main.kotlin.in_out

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val r1 = 9F
    val r2 = 5F
    val pi = PI

    val s1 = pi * (r1.pow(2))
    val s2 = pi * (r2.pow(2))
    val s3 = s1 - s2
    println(s1)
    println(s2)
    println(s3)
}