package main.kotlin.`if`

fun main() {
    val a = 7F
    val b = 9F
    val c = 3F

    if (a < b && a < c){
        print(a)
    }else if (b < c){
        print(b)
    }else print(c)
}