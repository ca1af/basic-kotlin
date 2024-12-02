package com.lannstark.lec15

fun main() {
    val nums = listOf(1, 2, 3)
    val emptyList = emptyList<String>() // generic 은 똑같네?
    consumeNums(emptyList()) // 타입추론 가능하면 타입 명시 불필요
    val valuesList = mutableListOf(1, 2, 3)
    valuesList.clear()
    nums.toMutableList() // type 형변환은 무조건 to~ 쓰는구나
    val list : List<Int?>? // 리스트와 요소 모두 널인지 체크해야 하는 녀석
}

private fun consumeNums(nums: List<Int>) {

}

private fun <T> convertToMutable(immutable: List<T>): List<T>{
    return immutable.toMutableList()
}


private fun mapFunc(){
    val mutableMap = mutableMapOf<String, Int>()
    mutableMap["Foo"] = 1 // 이런게 가능하다니
}
