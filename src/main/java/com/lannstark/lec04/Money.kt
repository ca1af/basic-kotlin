package com.lannstark.lec04

data class Money(val amount : Int){
    // operator overload
    operator fun plus(other : Money) : Money {
        return Money(this.amount + other.amount)
    }

    operator fun times(other : Money) : Money {
        return Money(this.amount * other.amount)
    }
}
