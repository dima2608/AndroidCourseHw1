package main.kotlin.loops

fun main() {
    val n = 3
    var a1 = 1
    var a2 = 2
    var a3 = 3

    print("$a1\n$a2\n$a3\n")

    for (i in 4..n+1){
        val a = a3
        a3 = a3 + a2 - 2 * a1
        a1 = a2
        a2 = a
        println(a3)
    }
}