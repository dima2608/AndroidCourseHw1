package main.kotlin.loops

fun main() {
    val n = 9
    var f1 = 1
    var f2 = 1
    var f: Int

    while (n > f2){
        f = f2
        f2 += f1
        f1 = f
    }
    if (n == f2) println(true) else println(false)
}
