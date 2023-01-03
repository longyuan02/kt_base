package com.derry.s2

// TODO 27.Kotlin语言的匿名函数的类型推断
fun main() {

    // 匿名函数，类型推断为String
    // 方法名 : 必须指定 参数类型 和 返回类型
    // 方法名 = 类型推断返回类型
    val method1 = { v1:Double, v2:Float, v3:Int ->
       "v1:$v1, v2:$v2, v3:$v3"
    } // method1 函数： (Double, Float, Int) -> String
    println(method1(454.5, 354.3f, 99))

    val method2 = {
        3453.3f
    } // method2 函数： () -> Unit
    println(method2())

    val method3 = { number: Int ->
        number
    } // method3 函数： (Int) -> Int
    println(method3(9))
}