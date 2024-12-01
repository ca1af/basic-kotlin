package com.lannstark.lec11

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

class StringUtilsTraditional {
    init {
        throw UnsupportedOperationException("Utility class")
    }

    companion object {
        fun isDirectoryPath(path: String): Boolean {
            return path.endsWith("/")
        }
    }
}

class GetterSetterTest(
    foo: String
){
    var foo = foo
        private set
}
