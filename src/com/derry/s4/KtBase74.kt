package com.derry.s4

class KtBase74(name: String) // 主构造
{
    // 2个参数的次构造函数，必须要调用主构造函数，否则不通过，  为什么次构造必须调用主构造？答：主构造统一管理 为了更好的初始化设计
    constructor(name: String, sex: Char) : this(name) {
        println("2个参数的次构造函数 name:$name, sex:$sex")
    }

    // 3个参数的次构造函数，必须要调用主构造函数
    constructor(name: String, sex: Char, age: Int) : this(name) {
        println("3个参数的次构造函数 name:$name, sex:$sex, age:$age")
    }

    // 4个参数的次构造函数，必须要调用主构造函数
    constructor(name: String, sex: Char, age: Int, info: String) : this(name) {
        println("4个参数的次构造函数 name:$name, sex:$sex, age:$age, info:$info")
    }
}

// TODO 74.Kotlin语言的次构造函数学习
// name: String, sex: Char, age: Int, info: String
fun main() {
    val p = KtBase74("李元霸") // 调用主构造

    KtBase74("张三", '男') // 调用 2个参数的次构造函数

    KtBase74("张三2", '男', 88) // 调用 3个参数的次构造函数

    KtBase74("张三3", '男', 78, "还在学校新语言") // 调用 4个参数的次构造函数
}