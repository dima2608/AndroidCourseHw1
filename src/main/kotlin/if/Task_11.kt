package main.kotlin.`if`

import kotlin.math.pow

fun main() {
    val x = 2F
    var f = 0F

    if ( x <= 0) f = -x

    if (x > 0 && x < 2) f = x.pow(x)

    if ( x >= 2) f = 4F

    print("$f")
}