package com.lannstark.lec02

fun startsWithA(str: String?): Boolean {
    requireNotNull(str) { "Messages placed in here" } // synthetic sugar
    requireNotNull(str, { "Foo22" }) // also lambda
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    sum(1, 2)
    return str.startsWith("A") // null checked
}

fun startWithA2(str: String?): Boolean? {
    if (str == null) {
        throw IllegalArgumentException("foo")
    }

    return str.startsWith("A")
}

fun startWithA3(str: String): Boolean {
    return str.startsWith("A")
}

fun nullableInstanceCannotCallDirectly(str: String?) {
//    str.startsWith("Foo") // raises exs
    str?.startsWith("F") // OK
}

fun safeCall(str: String?) {
    println(str?.startsWith("F")) // 전체가 null 처리 된다
}


fun main(args: Array<String>) {
    startsWithA(null)
    actuallyItIsNotNull(null) // NPE
}

fun foo(str: String?) {
    str ?: throw NullPointerException("foo")
}

fun actuallyItIsNotNull(str: String?): Boolean {
    return str!!.startsWith("A");
}
