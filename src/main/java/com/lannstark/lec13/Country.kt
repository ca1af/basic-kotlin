package com.lannstark.lec13

fun getCountry(name: String): Country {
    return enumValues<Country>().firstOrNull() { it.name == name }
        ?: throw IllegalArgumentException("Country $name not found")
}

enum class Country {
    KOREA,
    US,
    CHINA
}
