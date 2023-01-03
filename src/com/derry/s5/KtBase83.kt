package com.derry.s5

// KT所有的类，默认是final修饰的，不能被继承，和Java相反
// open：移除final修饰
open class Person(private val name: String) {

    private fun showName() = "父类 的姓名是【$name】"

    // KT所有的函数，默认是final修饰的，不能被重写，和Java相反
    open fun myPrintln() = println(showName())
}

class Student(private val subName: String) : Person(subName) {

    private fun showName() = "子类 的姓名是【${subName}】"

    override fun myPrintln() = println(showName())

}

// TODO 83.Kotlin语言的继承与重载的open关键字学习
// 1.父类 val name  showName()->String  myPrintln->Unit
// 2.子类 myPrintln->Unit
fun main() {
    val person: Person = Student("张三")
    person.myPrintln()
}