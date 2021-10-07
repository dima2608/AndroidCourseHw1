package main.kotlin.`if`

fun main() {
    val x = 9
    val f: Int
    if (x < -2 || x > 2) {
        f = 2 * x
    }else {
        f = -3 * x
    }
    print(f)
}