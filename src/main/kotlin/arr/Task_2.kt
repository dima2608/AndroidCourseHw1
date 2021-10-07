package main.kotlin.arr

fun main (){
    val n = 4
    var num:Double = 1.0
    var arr = emptyArray<Int>()
    while (arr.size < n){
        arr += Math.pow(2.0, num).toInt()
        num += 1
    }
    arr.forEach { i -> println("$i") }
}