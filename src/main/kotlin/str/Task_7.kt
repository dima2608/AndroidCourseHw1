package main.kotlin.str

fun main (){
    val str: String = "450"
    var sum = 0
    for (e in str){
        sum += e.toString().toInt()
    }
    println(sum)
}