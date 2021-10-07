package main.kotlin.`if`

fun main() {
    var a = 5F
    var b = 5F

    if (a != b){
        var c = a + b
        a = c
        b = c

        print("$a\n$b")
    }else if (a == b){
        a = 0F
        b = 0F

        print("$a\n$b")
    }
}