package com.lannstark.lec10

interface Swimable {
    val swimAbiliy : Int
        get() = 111

    fun act(){
        println("foo~")
    }
}
