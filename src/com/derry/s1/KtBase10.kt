package com.derry.s1

const val PI = 3.1415 // 定义编译时常量

// TODO 10.Kotlin语言的编译时常量
// 编译时常量只能是常用的基本数据类型：（String，Double，Int，Float，Long，Short，Byte，Char，Boolean）
// 编译时常量只能在函数之外定义，为什么？答：如果在函数之内定义，就必须在运行时才能调用函数赋值，何来编译时常量一说
// 结论：编译时常量只能在函数之外定义，就可以在编译期间初始了

fun main() {
    val info = "Derry info" // 这个称为 只读类型的变量

    // 提示：修饰符const不适用于 局部变量
    // const val PI = 45

    // const val PI2 = 3.1415 // 定义编译时常量
}