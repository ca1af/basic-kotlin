package com.lannstark.lec03

fun main() {
    kotlinAlwaysNeedsTypeCast()
    val unit: Unit = printAge(Person("", 100)) // unit
    println(unit)
    doAction { Person("", 100) }
}

fun kotlinAlwaysNeedsTypeCast() {
    val intNumber = 3
//    val longNumber: Long = intNumber // Type mismatch
    val longNumber: Long = intNumber.toLong()

    println(intNumber + longNumber)
}

fun printAge(obj: Any?) {
    val person = obj as? Person // NPE 방지
    println(person?.age)
}

fun doAction(action: () -> Person) {
    val person: Person = action()
    println(person.age)
}

