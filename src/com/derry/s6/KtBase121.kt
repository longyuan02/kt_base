package com.derry.s6

import com.derry.s6.com.derry.randomItemValue as g  // as g 重命名扩展操作
import com.derry.s6.com.derry.randomItemValuePrintln as p // as g 重命名扩展操作

// TODO 121-Kotlin语言的重命名扩展学习
fun main() {

    val list : List<String> = listOf("李元霸", "李连杰", "李小龙")
    val set : Set<Double> = setOf(545.5, 434.5, 656.6)

    // 使用 扩展文件
    println(list.g())
    println(set.g())

    println()

    list.p()
    set.p()
}