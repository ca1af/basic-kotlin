package com.lannstark.lec04

fun main() {
    compareToApplied()
    equalityAndIdentityInKotlin()
    commandIn()
    iteratorKeyword()
    operatorOverload()
}

/**
 * 객체간 비교연산자(>) 사용 시 구현되어 있는 CompareTo 호
 */
fun compareToApplied() {
    val javaMoney1 = JavaMoney(1000)
    val javaMoney2 = JavaMoney(2000)

    if (javaMoney2 > javaMoney1) {
        println("compareTo")
    }
}

fun equalityAndIdentityInKotlin() {
    val javaMoney1 = JavaMoney(1000)
    val javaMoney2 = JavaMoney(1000)

    val identity = javaMoney1 === javaMoney1
    val equality = javaMoney1 == javaMoney2

    println("identity : $identity, equality : $equality")
}

fun commandIn() {
    val intList = listOf(1, 2, 3, 4, 5)
    if (1 in intList) {
        println("1 in intList")
    }
    if (intList.contains(1)) {
        println("same as java")
    }
}

fun iteratorKeyword() {
    val intRange = 1..5
    intRange.filter { it % 2 == 0 }.forEach { println(it) }
}

fun operatorOverload(){
    val money = Money(1)
    val money2 = Money(2)

    println(money + money2)
}
