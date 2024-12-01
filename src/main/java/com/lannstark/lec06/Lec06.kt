package com.lannstark.lec06

fun main() {
    forEachTest()
    forTest()
    generateSequenceTest()
}

private fun forEachTest() {
    listOf(1, 2, 3).forEach { _ -> println() }
}

private fun forTest(){
    for (i in 1..3){
        println(i)
    }

    for (i in 4 downTo 0 step 2){
        println(i)
    }
}

private fun generateSequenceTest(){
    val sequence = generateSequence(1) { it * 2 }
    sequence.takeWhile { it <= 4 }.forEach { println(it) }
}
