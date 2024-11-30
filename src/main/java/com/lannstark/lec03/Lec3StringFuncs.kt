package com.lannstark.lec03

fun main(){
    printName()
    printCharAt("ABC", 0)
}

fun printName(){
    val person = Person("DK", 100)
    println("name : ${person.name}")
}

fun printCharAt(str: String, idx: Int){
    println(str[idx])
}
