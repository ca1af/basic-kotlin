package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    foo()
    use()
}

private fun parseInt(input: String): Int? {
    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

private fun foo(){
    val currentFile = File(".")
    val txt = File(currentFile.absolutePath + "/a.txt")
    val bufferedReader = BufferedReader(FileReader(txt))
    val txtLine = bufferedReader.readLine()
    println(txtLine)
    bufferedReader.close()
}

private fun use(){
    val currentFile = File(".")
    val txt = File(currentFile.absolutePath + "/a.txt")
    val bufferedReader = BufferedReader(FileReader(txt))
    bufferedReader.use {
        reader -> println(reader.readLine())
    }
}
