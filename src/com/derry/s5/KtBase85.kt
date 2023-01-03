package com.derry.s5

import kotlin.math.expm1

open class Person3(val name: String) {
    private fun showName() = "父类显示:$name"

    open fun myPrintln() = println(showName())

    fun methodPerson() = println("我是父类的方法...") // 父类独有的函数
}

class Student3(val nameSub: String) : Person3 (nameSub) {
    override fun myPrintln() = println("子类显示:$nameSub")

    fun methodStudent() = println("我是子类的方法...") // 子类独有的函数
}

// TODO 85.Kotlin语言的智能类型转换学习
fun main() {
    val p : Person3 = Student3("李四")

    (p as Student3).methodStudent()

    p.methodStudent()

    p.methodStudent()

    p.methodStudent()

    // 智能类型转换：会根据上面 as 转成的类型，自动明白，你现在的类型就是上面的类型
}
