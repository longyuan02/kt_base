package com.derry.s3

// TODO 42.Kotlin语言的先决条件函数
fun main() {
    var value1: String ? = null
    var value2: Boolean = false

    // checkNotNull(value1) // java.lang.IllegalStateException: Required value was null.

    // requireNotNull(value1) // java.lang.IllegalArgumentException: Required value was null.

    require(value2) // java.lang.IllegalArgumentException: Failed requirement.
}