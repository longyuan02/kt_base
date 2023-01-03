package com.derry.s6

// TODO 124-Kotlin语言的变换函数-map
fun main() {
    val list = listOf("李元霸", "李连杰", "李小龙")
    // T T T  --->  新的集合(R, R, R)
    // 原理：就是把你 匿名函数 最后一行的返回值 加入一个新的集合，新集合的泛型是R，并且返回新集合
    val list2 : List<Int> = list.map {
        // it = T == 元素 == String
        "【$it】"
        88
    }
    println(list2)

    // 用途： 和 RxJava的思路，一模一样
    val list3 : List<String> = list.map {
        "姓名是:$it"
    }.map {
        "$it，文字的长度是:${it.length}"
    }.map {
        "【$it】"
    }
    for (s in list3) {
        print("$s  ")
    }

    println()

    list.map {
        "姓名是:$it"
    }.map {
        "$it，文字的长度是:${it.length}"
    }.map {
        "【$it】"
    }.map {
        print("$it  ")
    }
}