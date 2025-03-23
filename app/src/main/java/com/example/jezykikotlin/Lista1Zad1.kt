package com.example.jezykikotlin.zad1
import kotlin.math.sqrt


fun heron(a:Double, b:Double, c:Double): Double {
    //czy boki sa dodatnie
    if (a <= 0 || b <= 0 || c <= 0) {
        throw IllegalArgumentException("Boki nie moga byc mniejsze lub rowne 0!")
    }

    //warunek nierownosci
    if (a + b <= c || a + c <= b || b + c <= a ) {
        throw IllegalArgumentException("Nie zostal spelniony warunek nierownosci")
    }

    val p = 0.5 * (a+b+c)
    return sqrt( p* (p-a) * (p-b) * (p-c) )
}

fun main() {
    val trojkat = heron(2.0,5.0,6.0)
    println(trojkat)
}