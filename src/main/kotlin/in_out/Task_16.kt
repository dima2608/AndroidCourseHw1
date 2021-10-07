package main.kotlin.in_out

import kotlin.math.abs

fun main() {
    val x1 = 7.9F
    val x2 = 1.7F
    val y1 = 9.3F
    val y2 = 8.5F

    val ab = abs(y2 - y1)
    val bc = abs(x2 - x1)

    val p = 2 * (ab + bc)
    val s = ab * bc

    print("$p\n$s")
}