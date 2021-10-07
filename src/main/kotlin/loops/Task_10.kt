package main.kotlin.loops

fun main (){
    var n = 18

    while (n > 0 ){
        println("${n % 10}")
        n /= 10
    }
}