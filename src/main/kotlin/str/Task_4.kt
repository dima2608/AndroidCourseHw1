package main.kotlin.str

fun main() {
    val str = "450Dfrlsdadalsld"

    val result = str.filter { it.isDigit() }
    println(result.toString().length)
}