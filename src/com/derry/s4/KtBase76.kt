package com.derry.s4

/*class A {

    {

    }

    A() {

    }

}*/

// username: String, userage: Int, usersex: Char  临时类型，必须要二次转换，才能用
class KtBase76 (username: String, userage: Int, usersex: Char) // 主构造
{
    // 这个不是Java的 static{}
    // 相当于是Java的 {} 构造代码块
    // 初始化块  init代码块
    init {
        println("主构造函数被调用了 $username, $userage, $usersex")

        // 如果第一个参数是false，就会调用第二个参数的lambda
        // 判断name是不是空值 isNotBlank   ""
        require(username.isNotBlank()) { "你的username空空如也，异常抛出" }

        require(userage > 0) { "你的userage年龄不符合，异常抛出" }

        require( usersex == '男' || usersex == '女') { "你的性别很奇怪了，异常抛出" }
    }

    constructor(username: String) : this(username, 87, '男') {
        println("次构造函数被调用了")
    }

    fun show() {
        // println(username) // 用不了，必须要二次转换，才能用
    }
}

// TODO 76.Kotlin语言的初始化块学习
// 1.name,age,sex的主构造函数
// 2.init代码块学习 require
// 3.临时类型只有在 init代码块才能调用
fun main() {
    KtBase76("李四", userage = 88, usersex = '女')  // 调用主构造
    println()
    KtBase76("王五") // 调用次构造

    // KtBase76("") // 调用次构造

    // KtBase76("李四", userage = -1, usersex = 'M')  // 调用主构造

    KtBase76("李四", userage = 1, usersex = '男')  // 调用主构造
}