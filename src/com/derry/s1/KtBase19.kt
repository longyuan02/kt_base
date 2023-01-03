package com.derry.s1

// TODO 19.Kotlin语言的Unit函数特点
fun main() {

}

// Java语言的void关键字(void是 无参数返回的 忽略类型) 但是他是关键帧啊，不是类型，这很矛盾
// : Unit不写，默认也有，Unit代表  无参数返回的 忽略类型 == Unit类型类
private fun doWork() : Unit {
    return println()
}

private fun doWork2() {
    return println()
}

private fun doWork3() /*: Unit*/ {
    println()
}