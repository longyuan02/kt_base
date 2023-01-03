package com.derry.s3

import java.io.File

// TODO 54.Kotlin语言的also内置函数
// "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
fun main() {
    val str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val r1 : String = str.also {
        true
        354543.4f
        454
        'C'
    }

    val r2 : Int = 123.also {
        true
        354543.4f
        454
        'C'
        false
    }

    str.also {
        // it == str本身
    }

    // 真正使用also函数的写法规则如下：
    // str.also特点：also函数始终是返回 “str本身”，所以可以链式调用
    str.also {
        println("str的原始数据是:$it")
    }.also {
        println("str转换小写的效果是:${it.toLowerCase()}")
    }.also {
        println("结束了")
    }

    val file = File("D:\\a.txt")


    // 匿名函数里面做的事情，和sourceFile无关，因为永远都是返回 file本身
    val sourceFile = file.also {
        file.setReadable(true)
        file.setWritable(true)
        println(file.readLines())
        // 假设 做了很多很多的事情
        // ...
    }.also {
        file.setReadable(true)
        println(file.readLines())
        // 假设 做了很多很多的事情
        // ...
    }.also {
        file.setReadable(true)
        println(file.readLines())
        // 假设 做了很多很多的事情
        // ...
    }
    // sourceFile没有任何影响
}