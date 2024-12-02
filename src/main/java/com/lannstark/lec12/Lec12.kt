package com.lannstark.lec12

import com.lannstark.lec13.getCountry

open class Lec12 {
    private companion object Factory : Movable {
        private const val FOO = "FOO"

        override fun move() {
            TODO("Not yet implemented")
        }

        @JvmStatic
        override fun fly() {
            println("fly")
        }
    }

    fun printFoo() {
        println(FOO)
    }
}

fun main() {
    val movableImpl = object : Movable {
        override fun move() {
            TODO("Not yet implemented")
        }

        override fun fly() {
            TODO("Not yet implemented")
        }
    }

    val china = getCountry("CHINA")
    println(china)
}
