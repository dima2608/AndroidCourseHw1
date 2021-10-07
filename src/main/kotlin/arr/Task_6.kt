package main.kotlin.arr

import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(0, 100) }
    var f = true

    arr.forEach { i ->
        if (i < arr[9]){
            println("$i")
            f = false
            return
        }

    }
    if (f) {
        println(0)
    }

}