package main.kotlin.in_out

fun main(){
    println("add square side:")
    val squareSide = readLine()!!.toFloat()
    print("S = ${squareSide * squareSide}")
}