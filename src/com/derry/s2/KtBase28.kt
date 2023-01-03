package com.derry.s2

// TODO 28.Kotlin语言的lambda学习
fun main() {

    // 匿名函数 == lambda表达式
    val addResultMethod = { number1 : Int, number2: Int ->
        "两数相加的结果是:${number1 + number2}"
    } // addResultMethod 函数： (Int, Int) -> String
    println(addResultMethod(1, 1))

    // 匿名函数 入参 Int,          返回 Any类型
    // lambda表达式的参数 Int,    lambda表达式的结果Any类型
    val weekResultMethod = { number: Int ->
        when(number) {
            1 -> "星期1"
            2 -> "星期2"
            3 -> "星期3"
            4 -> "星期4"
            5 -> "星期5"
            else -> -1
        }
    } // weekResultMethod 函数： (Int) -> Any
    println(weekResultMethod(2))

    // 匿名函数 属于 lambda
}