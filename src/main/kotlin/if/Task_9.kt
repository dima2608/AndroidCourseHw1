package main.kotlin.`if`

fun main (){
    val a = 1000
    val b = 300
    val c = 1000

    if (a > b && b < c){
        print("$a + $c = ${a + c}")

    }else if (a > b && c < b){
        print("$b + $a = ${a + b}")
    }else{
        print("$b + $c = ${b + c}")
    }
}