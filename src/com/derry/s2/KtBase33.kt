package com.derry.s2

// TODO 33.Kotlin语言的函数类型作为返回类型
fun main() {
    val r = show("学习KT语言")
    // r 是show函数的 返回值

    val niming_showMethod = showMethod("show")
    // niming_showMethod 是 showMethod函数的返回值 只不过这个返回值 是一个 函数

    // niming_showMethod == 匿名函数
    println(niming_showMethod("Derry", 33))
}

fun show(info: String): Boolean {
    println("我是show函数 info:$info")
    return true
}

fun show2(info: String): String {
    println("我是show函数 info:$info")
    return "DDD"
}

fun show3(info: String): String {
    println("我是show函数 info:$info")
    return /*888*/ ""
}

// showMethod函数 再返回一个 匿名函数
fun showMethod(info: String): (String, Int) -> String {
    println("我是show函数 info:$info")

    // return 一个函数 匿名函数
    return { name: String, age: Int ->
        "我就是匿名函数：我的name:$name, age:$age"
    }
}