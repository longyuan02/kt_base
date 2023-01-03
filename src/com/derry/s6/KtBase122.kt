package com.derry.s6

import java.io.File

// TODO 122-Kotlin语言的apply函数详解
fun main() {
    val r : File = File("D:\\a.txt")
        .mApply {
            // 输入的是 this == File对象本身
            setReadable(true)
            setWritable(true)
            println("1 ${readLines()}")
        }.mApply {
            // 输入的是 this == File对象本身
            setReadable(true)
            setWritable(true)
            println("2 ${readLines()}")
        }.mApply {
            // 输入的是 this == File对象本身
            setReadable(true)
            setWritable(true)
            println("3 ${readLines()}")
        }
        // ... 省略

    /*123.mApply()
    'C'.mApply()*/

    // 省略几万行代码
    // ...

    println()

    val r2 : File = File("D:\\a.txt")
        .apply {
            // 输入的是 this == File对象本身
            setReadable(true)
            setWritable(true)
            println("1 ${readLines()}")
        }.apply {
            // 输入的是 this == File对象本身
            setReadable(true)
            setWritable(true)
            println("2 ${readLines()}")
        }.apply {
            // 输入的是 this == File对象本身
            setReadable(true)
            setWritable(true)
            println("3 ${readLines()}")
        }
    // ... 省略
}

// private私有
// inline 因为我们的函数是高阶函数，需要使用内联对 lambda进行优化处理，提高性能
// fun <INPUT> 函数中声明一个泛型
// INPUT.mApply 让所有的类型，都可以 xxx.myApply  泛型扩展
//  INPUT.() -> Unit 让我们的匿名函数里面持有 this ,在lambda里面不需要返回值，因为永远都是返回INPUT本身
// lambda(this) 默认就有this
// 返回this的目的是可以链式调用
private inline fun <INPUT> INPUT.mApply(lambda : INPUT.() -> Unit) : INPUT  {
    lambda() // 省略this
    return this
}