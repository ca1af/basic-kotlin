package com.lannstark.lec17

import java.util.*

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    filter(fruits, isApple).forEach(::println)
    filter(fruits) { it.name != "사과"}.forEach(::println)
}

// 익명함수 형태 1
val isApple: (Fruit) -> Boolean = fun (fruit :Fruit) : Boolean {
    return fruit.name == "사과"
}

// (Fruit) -> Boolean 생략가능
val isApple2 = {fruit : Fruit -> fruit.name == "사과"}

private fun filter(fruits: List<Fruit>, predicate: (Fruit) -> Boolean) : List<Fruit> {
    return fruits.filter(predicate)
}
