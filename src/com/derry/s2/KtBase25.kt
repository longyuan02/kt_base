package com.derry.s2

// TODO 25.Kotlin语言的函数参数学习
fun main() {

    // 我们现在在写函数

    // 第一步：函数输入输出的声明   第二步：对声明函数的实现
    val methodAction : (Int, Int, Int) -> String = { number1, number2, number3 ->
        val inputValue = 999999
        "$inputValue Derry 参数一:$number1, 参数二:$number2, 参数三:$number3"
    }
    // 第三步：调用此函数
    println(methodAction(1, 2, 3))
}

/*
fun methodAction(number1: Int, number2: Int, number3: Int) : String {
    val inputValue = 999999
    return "$inputValue Derry 参数一:$number1, 参数二:$number2, 参数三:$number3"
}
 */