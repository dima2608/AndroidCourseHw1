package main.kotlin.`if`

fun main() {
    val a = 199
    val b = 100
    val c = 1100

    if (a > c && b > c){
        if (c > b) print(c) else print(b)
    }
    if (b > a && b > c){
        if (a > c) print(a) else print(c)
    }
    if (c > a && c > b){
        if (a > b) print(a) else print(b)
    }

}