package main.kotlin.`if`

fun main() {
    var num = -1

    if(num > 0) {
        print("${num + 1}")
    }else if (num == 0){
        num = 10
        print(num)
    }else{
        print("${num - 2}")
    }
}