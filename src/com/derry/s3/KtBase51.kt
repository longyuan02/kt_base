package com.derry.s3

// TODO 51.Kotlin语言的let内置函数
// 普通方式 对集合第一个元素相加
// let方式 对集合第一个元素相加
// 普通方式 对值判null，并返回
// let方式 对值判null，并返回
fun main() {
    // 普通方式 对集合第一个元素相加
    val list = listOf(6, 5, 2, 3, 5, 7)
    val value1 = list.first() // 第一个元素
    val result1 = value1 + value1
    println(result1)

    // let方式 对集合第一个元素相加
    val result2 = listOf(6, 5, 2, 3, 5, 7).let {
        // it == list集合
        it.first() + it.first() // 匿名函数的最后一行，作为返回值，let的特点，   但是前面学的apply永远是返回info本身
        /*true
        true
        true*/
    }
    println(result2)

    println()

    // 普通方式 对值判null，并返回
    println(getMethod1(/*null*/ "Derry"))

    // let方式 + 空合并操作符 对值判null，并返回
    println(getMethod3(/*null*/ "Derry"))
}

// 普通方式 对值判null，并返回
fun getMethod1(value: String?) : String {
    return if (value == null) "你传递的内容是null，你在搞什么飞机" else "欢迎回来${value}非常欢迎"
}
// 普通方式 简化版本
fun getMethod2(value: String?) = if (value == null) "你传递的内容是null，你在搞什么飞机" else "欢迎回来${value}非常欢迎"

// let方式 + 空合并操作符 对值判null，并返回
fun getMethod3(value: String?) : String {
    return value?.let {
        "欢迎回来${it}非常欢迎"
    } ?: "你传递的内容是null，你在搞什么飞机"
}

// let方式 + 空合并操作符 对值判null，并返回 简化版本
fun getMethod4(value: String?) =
     value?.let {
        "欢迎回来${it}非常欢迎"
    } ?: "你传递的内容是null，你在搞什么飞机"

