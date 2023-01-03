package com.derry.s6

// TODO 127-Kotlin语言的合并函数-zip
fun main() {
    val names = listOf("张三", "李四", "王五")
    val ages = listOf(20, 21, 22)

    // RxJava zip 合并操作符
    // KT 自带就有zip 合并操作

    // 原理：就是把 第一个集合 和 第二个集合 合并起来，创建新的集合，并返回
    //      创建新的集合(元素，元素，元素) 元素Pair(K, V)  K代替第一个集合的元素   V代替第二个集合的元素
    val zip : List<Pair<String, Int>> = names.zip(ages)
    println(zip)
    println(zip.toMap())
    println(zip.toMutableSet())
    println(zip.toMutableList())

    println()

    // 遍历
    zip.forEach {
        // it == Pair<String, Int>
        println("姓名是:${it.first}, 年龄是:${it.second}")
    }

    println()

    // map 普通方式
    zip.toMap().forEach { k, v ->
        println("姓名是:${k}, 年龄是:${v}")
    }

    println()

    // map 解构的方式
    zip.toMap().forEach { (k, v) ->
        println("姓名是:${k}, 年龄是:${v}")
    }

    println()

    zip.toMap().forEach {
        // it == Map的元素 每一个元素 有K和V，  Map.Entry<String, Int>
        // it == Pair<String, Int>
        println("姓名是:${it.key}, 年龄是:${it.value}")
    }
}