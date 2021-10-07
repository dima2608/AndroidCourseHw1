package main.kotlin.loops

fun main (){
    val a = 3
    val b = 5

    for (i in a until b) println("$i + ${i + 1} = ${i +(i + 1)}")
}