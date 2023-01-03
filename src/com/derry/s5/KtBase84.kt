package com.derry.s5

import java.io.File

open class Person2(private val name: String) {

    fun showName() = "父类 的姓名是【$name】"

    // KT所有的函数，默认是final修饰的，不能被重写，和Java相反
    open fun myPrintln() = println(showName())
}

class Student2(private val subName: String) : Person2(subName) {

    fun showName2() = "子类 的姓名是【${subName}】"

    override fun myPrintln() = println(showName2())

}

// TODO 84.Kotlin语言的类型转换学习
// 1.普通运行子类输出
// 2.is Person Student File
// 3.is + as 转换
fun main() {
    val p: Person2 = Student2("王五")
    p.myPrintln()

    println(p is Person2)
    println(p is Student2)
    println(p is File)

    // is + as = 一般是配合一起使用
    if (p is Student2) {
        (p as Student2).myPrintln()
    }

    if (p is Person2) {
        // (p as Person2).myPrintln() // 因为子类重写了父类
        println((p as Person2).showName())
    }
}