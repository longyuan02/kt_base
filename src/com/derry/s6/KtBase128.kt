package com.derry.s6

// TODO 128-Kotlin语言中使用函数式编程
/*
fun main() {
    // 1.定义name集合
    val names = listOf("Zhangsan", "Lisi", "Wangwu")
    // 2.定义age集合
    val ages = listOf(20, 21, 22)
    // 3.合并以上两个集合
    // 4.给集合添加详细内容，方便输出
    // 5.输出最后的成果 结果
    names.zip(ages).toMap().map { "you name:${it.key}, you age:${it.value}" }.map { println(it) }
}
*/

fun main() {
    listOf("Zhangsan", "Lisi", "Wangwu").zip(listOf(20, 21, 22)).toMap().map { println("you name:${it.key}, you age:${it.value}") }
}


