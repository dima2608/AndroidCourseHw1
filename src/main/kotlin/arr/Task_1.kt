package main.kotlin.arr

fun main (){
    val n = 3
    var num = 1
    var arr = emptyArray<Int>()
    while (arr.size < n){
        if(num % 2 != 0) arr += num
        num += 1
    }
    arr.forEach { i -> println("$i") }

}