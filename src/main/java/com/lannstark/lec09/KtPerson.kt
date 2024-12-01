package com.lannstark.lec09

class KtPerson (val name: String = "foo", var age: Int = 10) {
    init {
        require(name == "foo") {"허허..."}
        require(age > 0) {"나이는 $age 일 수 없다"}
    }

    val isAdult: Boolean get() {
        return this.age >= 20
    }

    val isAdult2: Boolean get() = this.age >= 20

    companion object {
        fun ofName(name: String): KtPerson {
            return KtPerson()
        }
    }
}

fun main() {
    val ktPerson = KtPerson()
    ktPerson.age = 20
    println(ktPerson.isAdult)
    println(ktPerson.isAdult2)
    println(ktPerson.name)
}
