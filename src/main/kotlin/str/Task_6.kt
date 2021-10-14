package main.kotlin.str

import java.awt.List
import java.sql.Array
import kotlin.reflect.typeOf

fun main() {
    val num = 450
    var li = emptyArray<Char>()
    num.toString().forEach { i ->
        li += i.toChar()

    }
    li.forEach { i -> print(i) }
}