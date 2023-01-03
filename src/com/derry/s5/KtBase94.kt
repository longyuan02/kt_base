package com.derry.s5

class AddClass(number1: Int, number2: Int)

// 写一个数据类，就是为了，toString 打印方便而已哦
data class AddClass2(var number1: Int, var number2: Int) {
    operator fun plus(p1: AddClass2) : Int {
        return (number1 + p1.number1) + (number2 + p1.number2)
    }

    // 查看 整个KT可以用的  运算符重载 方式
    // operator fun AddClass2.
}

// TODO 94-Kotlin语言的运算符重载学习
fun main() {
    // C++语言  +运算符重载就行了  -运算符重载就行了
    // KT语言  plus代表+运算符重载

    println(AddClass2(1, 1) + AddClass2(2, 2))
}