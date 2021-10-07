package main.kotlin.`if`

fun main() {
    val rik = 345

    if ( rik % 4 == 0){
        if (rik % 100 == 0){
            if (rik % 400 > 0 || rik % 400 < 0){
                print("365")
            }else print("366")
        }else print("366")
    }else print("365")
}