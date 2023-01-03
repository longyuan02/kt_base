package com.derry.s3

// TODO 53.Kotlin语言的with内置函数
fun main() {
    val str = "李元霸"

    // 具名操作
    /*with(str) {
        this == str本身
    }*/
    val r1 = with(str, ::getStrLen)
    val r2 = with(r1, ::getLenInfo)
    val r3 = with(r2, ::getInfoMap)
    with(r3, ::show)

    println()

    // 匿名操作
    with(with(with(with(str) {
        length
    }) {
        "你的字符串长度是:$this"
    }){
        "【$this】"
    }){
        println(this)
    }
}

fun getStrLen(str: String) = str.length
fun getLenInfo(len: Int) = "你的字符串长度是:$len"
fun getInfoMap(info: String) = "【$info】"
fun show(content: String) = println(content)
