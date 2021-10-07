package main.kotlin.loops

fun main() {
    var n  = 18
    val k = 3
    var dril = 0

    while (n -k >= 0){
        n -= k
        dril += 1
    }
    println(dril)
    println(n)
}