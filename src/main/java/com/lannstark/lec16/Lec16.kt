package com.lannstark.lec16

fun main() {
    extendedFun()
    fooTest()
    1 add2 2 // 중위함수
}

private fun extendedFun() {
    val foo = "FOO"
    val lastChar = foo.lastChar() // 확장함수 형태로 사용가능
    println(lastChar)
}

fun String.lastChar() :Char {
    return this[this.length - 1]
}

fun Person.nextYearAge() {
    // 맴버 함수가 항상 우선된다 (같은 메서드 시그니쳐)
}

open class Foo {
}

fun Foo.foo() :Unit{
    // Unit
    println("FOO")
}

class Foo2 : Foo() {
}

fun Foo2.foo(){
    // void
    println("FOO2")
}

fun fooTest() {
    val foo = Foo()
    val foo2 = Foo2()

    foo.foo()
    foo2.foo()
}

// 확장 프로퍼티
val String.lastChar : Char
    get() = this[length - 1]

infix fun Int.add2(other: Int) : Int{
    return this + other
}
