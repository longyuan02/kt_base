package com.derry.s6

// 自定义的中缀表达式 + 扩展函数 一起用的     使用者： "一".gogogo(1)  "一" gogogo 1
// 1.条件一  对第一个参数 C1.gogogo  函数扩展
// 2.条件二  需要在 括号(c2: C2) 参数里面，传递一个参数
private infix fun <C1, C2> C1.gogogo(c2: C2) {
    // 做很多的逻辑
    // ...
    // 省略几万行代码
    println("我们的中缀表达式，对一个参数的内容是:$this")
    println("我们的中缀表达式，对二个参数的内容是:$c2")
}

// TODO 119-Kotlin语言的infix关键字
// infix == 中缀表达式 可以简化我的代码
fun main() {
    // 下面是我们map自带的中缀表达式
    mapOf("零".to(0))

    mapOf("一" to 1)
    mapOf("二" to 2)
    mapOf("三" to 3)

    // 下面是我们自己写的中缀表达式
    123 gogogo '男'
    "Derry".gogogo('M')
    "Derry2" gogogo 'M'
}