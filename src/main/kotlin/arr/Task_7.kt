package main.kotlin.arr

import kotlin.random.Random

fun main() {
    val n = 10
    var min = 11
    val arr = Array(n) { Random.nextInt(0, 10) }
    arr.forEach { i -> print("$i;") }

    for (i in 0 until n step 2){
        min = minOf(min, arr[i + 1])
    }
    println(">>> $min")
}