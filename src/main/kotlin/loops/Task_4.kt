package main.kotlin.loops

fun main() {
    val a = 9.3F
    val n = 3
    var p = 1F

    for (i in 1..n+1){
        p *= a
        print("$p\n")
    }
}