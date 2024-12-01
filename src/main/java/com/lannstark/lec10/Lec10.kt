package com.lannstark.lec10

fun main() {
    val derived = Derived("Foo")
    derived.foo()
}

open class Base(open val string: String = "Not Foo") {
    init {
        println("Base")
        println(string) // 상위 클래스의 초기화 블락에서는 하위 클래스에 접근해서는 안된다 (Open 인 녀석을 init 에 쓰지말라)
    }

    fun foo() {
        println(string)
    }
}

class Derived(override val string: String) : Base(string) {
    init {
        println("Derived")
        println(string)
    }
}
