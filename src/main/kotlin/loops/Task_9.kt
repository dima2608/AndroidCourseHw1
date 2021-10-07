package main.kotlin.loops

fun main() {
    val p = 100
    var summ = 1000
    var k = 1

    while (summ <= 1100){
        summ *= (p / 100 + 1)
        k += 1
    }
    println(k)
    println(summ)
}