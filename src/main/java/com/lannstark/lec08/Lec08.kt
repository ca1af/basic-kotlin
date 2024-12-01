package com.lannstark.lec08

fun main() {
    println(max(1, 2))
    defaultParameter()
    defaultParameter("im not foo", 1)
    defaultParameter(num = 1) // 디폴트를 사용하는 경우 인자 이름을 정해서 넣어주면 된다
    printAll("a", "b")
    val fooArr = arrayOf("a", "b")
    printAll(*fooArr)
}

private fun max(a: Int, b: Int) = if (a > b) a else b

fun defaultParameter(
    str: String = "foo",
    num: Int = 3,
) {
    for (i in 0 until num) {
        println(str)
    }
}

fun printAll(vararg str: String) {
    str.forEach { println(it) }
}
