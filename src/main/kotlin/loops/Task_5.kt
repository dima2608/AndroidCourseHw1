package main.kotlin.loops

fun main() {
    val n = 9
    var i = 1
    var fact = 1

    while (i <= n){
        fact *= i
        i += 1
    }
    println("$fact")
}