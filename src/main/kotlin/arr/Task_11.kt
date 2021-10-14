package main.kotlin.arr

fun main() {
    val m = 3
    val n = 3
    var a = arrayOf<Array<Int>>()
    for (i in 0 until m) {
        var array = arrayOf<Int>()
        for (j in 0 until n) {
            array += i * 10
        }
        a += array
    }

    for (array in a) {
        for (value in array) {
            print("$value ")
        }
        println()
        println("--|--|--")

    }
    a.forEach { ints ->

        println(ints.minOrNull())
    }

}