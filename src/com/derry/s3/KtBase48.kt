package com.derry.s3

// TODO 48.Kotlin语言中数字类型的安全转换函数
fun main() {
    val number: Int = "666".toInt()
    println(number)

    // 字符串里面放入了Double类型，无法转换成Int，会奔溃
    // val number2: Int = "666.6".toInt()
    // println(number2)

    // 解决什么奔溃的问题
    val number2: Int? = "666.6".toIntOrNull()
    println(number2)

    val number3: Int? = "888".toIntOrNull()
    println(number3)

    val number4: Int? = "888.8".toIntOrNull()
    println(number4 ?: "原来你是null啊")

    // 小结：以后字符串有整形相关的转换，尽量用 toIntOrNull 此函数
}