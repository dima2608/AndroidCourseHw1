package main.kotlin.in_out

import kotlin.math.pow

fun main() {
    val x = 2F
    val y = 4 * ((x - 3).pow(6)) - 7 * ((x - 3).pow(3)) + 2

    print("$y")
}
