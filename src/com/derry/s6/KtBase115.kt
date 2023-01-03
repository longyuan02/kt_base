package com.derry.s6

// 1.String类型就输出长度
fun <T> T.showContentInfo() = println("${if (this is String) "你的字符串长度是:$length" else "你不是字符串 你的内容是:$this"}")

// 2.显示调用时间
fun <I> I.showTime() = println("你当前调用的时间是:${System.currentTimeMillis()}, 内容是:$this")

// 3.显示调用者的类型
fun <INPUTTYPE> INPUTTYPE.showTypesAction() =
    when(this) {
        is String -> "原来你是String类型"
        is Int -> "原来你是Int类型"
        is Char -> "原来你是Char类型"
        is Float -> "原来你是Float类型"
        is Double -> "原来你是Double类型"
        is Boolean -> "原来你是Boolean类型"
        is Unit -> "原来你是无参返回函数类型"
        else -> "未知类型"
    }

fun commonFun() {}

// fun commonFun2() = "DDD" 这个不管他

// TODO 115-Kotlin语言的泛型扩展函数
// 1.String类型就输出长度
// 2.显示调用时间
// 3.显示调用者的类型
fun main() {
    345.showContentInfo()
    'C'.showContentInfo()
    false.showContentInfo()
    345.45f.showContentInfo()
    53454.45.showContentInfo()
    "Derry".showContentInfo()
    commonFun().showContentInfo()
    // commonFun2().showContentInfo()
    // 太多了，不写了 .... 省略

    // 所有类型 都是泛型，你对泛型扩展了showContentInfo，那么所有类型都可以使用showContentInfo

    println()

    345.showTime()
    'C'.showTime()
    false.showTime()
    345.45f.showTime()
    53454.45.showTime()
    "Derry".showTime()
    commonFun().showTime()
    // commonFun2().showTime()
    // 太多了，不写了 .... 省略

    println()

    println(345.showTypesAction())
    println('C'.showTypesAction())
    println(false.showTypesAction())
    println(345.45f.showTypesAction())
    println(53454.45.showTypesAction())
    println("Derry".showTypesAction())
    println(commonFun().showTypesAction())
    // println(commonFun2().showTypesAction())
}