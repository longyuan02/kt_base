package com.derry.s4

// TODO  60.Kotlin语言的List集合遍历学习
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7)

    println(list) // 输出list详情而已，这个不是遍历集合

    // 第一种 遍历方式：
    for (i in list) {
        print("元素:$i  ")
    }

    println()

    // 第二种 遍历方式：
    list.forEach {
        // it == 每一个元素
        print("元素:$it  ")
    }

    println()

    // 第三种 遍历方式：
    list.forEachIndexed { index, item ->
        print("下标:$index, 元素:$item    ")
    }
}