package com.derry.s3

// TODO 52.Kotlin语言的run内置函数
// 1.run函数的特点 字符串延时
// 2.具名函数判断长度 isLong
// 3.具名函数监测合格 showText
// 4.具名函数增加一个括号 mapText
// 5.具名函数输出内容
fun main() {
    val str = "Derry is OK"
    val r1 : Float = str.run {
        // this == str本身
        true
        5435.5f
    }
    println(r1)

    // 下面是 具名函数 配合 run函数

    // 2.具名函数判断长度 isLong

    // 这个是属于 匿名函数 配合 run
    str.run {
        // this == str本身
    }

    // 这个是属于具名函数
    // str.run(具名函数)
    str
        .run(::isLong) // this == str本身
        .run(::showText) // this == isLong返回的boolean值
        .run(::mapText)
        .run(::println)

    println()

    // let函数持有it，run函数持有this 都可以很灵活的，把上一个结果值 自动给 下一个函数
    str.let(::isLong) // it == str本身
    .let(::showText) // it == isLong返回的boolean值
    .let(::mapText) // it == str本身
    .let(::println) // it == str本身

    println()

    // >>>>>>>>>>>>>>>>>>>>>> 上面全部都是具名函数调用给run执行  下面全部是 匿名函数调用给run执行
    str
        .run {
            if (length > 5) true else false
        }
        .run {
            if (this) "你的字符串合格" else "你的字符串不合格"
        }
        .run {
            "【$this】"
        }
        .run {
            println(this)
        }
}

fun isLong(str: String) /* : Boolean */ = if (str.length > 5) true else false

fun showText(isLong: Boolean) /*: String */ = if (isLong) "你的字符串合格" else "你的字符串不合格"

fun mapText(getShow: String) /*: String */ = "【$getShow】"