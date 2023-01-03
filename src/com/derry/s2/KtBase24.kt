package com.derry.s2

// TODO 24.Kotlin语言的函数类型&隐式返回学习
fun main() {
    // 我们现在在写函数

    // 第一步：函数输入输出的声明
    val methodAction : () -> String

    // 第二步：对上面函数的实现
    methodAction = {
        val inputValue = 999999
        "$inputValue Derry" // == 背后隐式 return "$inputValue Derry";
        // 匿名函数不要写return，最后一行就是返回值
    }

    // 第三步：调用此函数
    println(methodAction())
}

/**
 * 第一步 定义函数输入输出的声明  val funName()->Int(类型)
 * 第二步 对函数进行实现  funName={"dfdf"}
 * 第三步 调用函数 输出：println(funName)
 */
/*
fun methodAction() : String {
    return "Derry"
}
 */