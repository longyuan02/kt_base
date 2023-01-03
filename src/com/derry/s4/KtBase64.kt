package com.derry.s4

// TODO 64.Kotlin语言的集合转换与快捷函数学习
// 1.定义可变list集合
// 2.List 转 Set 去重
// 3.List 转 Set 转 List 也能去重
// 4.快捷函数去重 distinct
fun main() {
   val list : MutableList<String> = mutableListOf("Derry", "Derry", "Derry", "Leo", "Lance") // list 可以重复元素
    println(list)

    // List 转 Set 去重
    val set /*: Set<String>*/ = list.toSet()
    println(set)

    // List 转 Set 转 List 也能去重
    val list2 /*: List<String>*/ = list.toSet().toList()
    println(list2)

    // 快捷函数去重 distinct
    println(list.distinct()) // 内部做了：先转变成 可变的Set结合  在转换成 List集合
    println(list.toMutableSet().toList()) // 和上面代码等价
}