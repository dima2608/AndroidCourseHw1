package main.kotlin.in_out

fun main() {
    var a = 3
    var b = 7
    val c = a
    a = b
    b = c

    print("$a \n$b")
}