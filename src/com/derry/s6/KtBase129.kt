package com.derry.s6

// TODO 129-Kotlin语言的互操作性与可空性
fun main() {
    // 下面是 Java 与 KT 交互 ，错误的案例
    println(KtBase129().info1.length)
    // println(KtBase129().info2.length) // 引发空指针异常

    // 下面是 Java 与 KT 交互 ，错误的案例
    // : String! Java 与 KT 交互的时候，Java给KT用的值，都是 : String! 这种类型
    val info1  = KtBase129().info1
    val info2 = KtBase129().info2
    println(info1.length)
    // println(info2.length) // 引发空指针异常


    // 下面是 Java 与 KT 交互 ，正确的案例1
    // : String! Java 与 KT 交互的时候，Java给KT用的值，都是 : String! 这种类型
    // 只要是看到有  String! 的类型，在使用的时候，必须 ?.xxx，这个是规则1 这个规则1不好，如果忘记写，就有风险
    val info1s  = KtBase129().info1
    val info2s = KtBase129().info2
    println(info1s?.length)
    println(info2s?.length)

    // 下面是 Java 与 KT 交互 ，正确的案例2 (推荐)
    // : String! Java 与 KT 交互的时候，Java给KT用的值，都是 : String! 这种类型
    // 只要是看到有  String! 的类型，在使用的时候，必须 : String? 来接收Java值，这个是规则2（直接限定你不会出错了）
    val info1ss : String?  = KtBase129().info1
    val info2ss : String? = KtBase129().info2
    println(info1ss?.length)
    println(info2ss?.length)
}