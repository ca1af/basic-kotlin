package com.lannstark.lec05

fun main(){
    println(earlyReturnInKotlin(50))
    println(simpleRangeOfKotlin(1, 0..10))
    println(isEven(2))
}

/**
 * 내생각엔 그냥 얼리리턴이 보기 편한듯. 하지만 if-else 가 expression 으로 사용된다.
 */
fun earlyReturnInKotlin(score: Int): String{
    return if (score >= 50){
        "P"
    } else {
        "F"
    }
}

fun simpleRangeOfKotlin(given: Int, range: IntRange): Boolean{
    return given in range
}

fun isEven(score: Int): Boolean {
    return when (score % 2){
        0 -> true
        else -> false
    }
}

fun whenTest(score: Int){
    when (score){
        in 1..5 -> println("I")
        in 5..10 -> println("O")
    }

    when {
        score >= 5 -> println("P")
        score in 1..5 -> println("F")
        else -> require(true)
    }
}
