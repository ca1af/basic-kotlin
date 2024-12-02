package com.lannstark.lec15

fun main() {
    val nums = arrayOf(1, 2, 3, 4, 5)
    indices(nums)
    withIndex(nums)
    nums.plus(6) // 신세곈데?
}

private fun indices(nums: Array<Int>) {
    for (i in nums.indices) {
        println(nums[i])
    }
}

private fun withIndex(nums: Array<Int>) {
    for ((idx, value) in nums.withIndex()) {
        println("$idx, $value")
    }

    for ((i, j) in nums.withIndex()) {
        println("$i, $j")
    }
}
