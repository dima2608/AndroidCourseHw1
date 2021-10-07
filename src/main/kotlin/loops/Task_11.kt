package main.kotlin.loops

fun main() {
    var a = 2
    var b = 9

    while (a >= 0){
        if (a >= b){
            a %= b
        }
        else{
            b %= a
        }
        println("${a + b}")
    }
}
