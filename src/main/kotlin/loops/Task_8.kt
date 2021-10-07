package main.kotlin.loops



fun main (){
    val n = 28
    var sum = 0
    var k = 1
    for (i in 1..n) {
        sum += i
        k = i

        if(sum >= n) {
            break
        }
    }
    print("k = $k \nsum = $sum")
}
