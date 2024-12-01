package com.lannstark.lec10

class Penguin(species: String) : Animal(species, 2), Swimable, Flyable {
    private val wingCount = 2

    override fun move() {
        println("penguin")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override val swimAbiliy: Int
        get() = 3

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}
