package main.kotlin.str

fun main() {
    val char = 'd'
    val str = "digitddd"
    var newStr = " "
    str.forEach { i ->
        if (i == char) newStr += i
        newStr += i
    }
    println(newStr)
}