package main.kotlin.arr

fun main (){
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var count = 0
    arr.forEach { i ->
        if(i % 2 != 0){
            println(i)
            count += 1
        }
    }
    println("count = $count")
}