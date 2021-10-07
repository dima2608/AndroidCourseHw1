package main.kotlin.arr

fun main (){
    val arr = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,99,864)
    for (i in 1..arr.size step 2) {
        println(arr[i])
    }
}



