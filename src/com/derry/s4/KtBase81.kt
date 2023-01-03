package com.derry.s4

class KtBase81 {

    val info: String

    init {
        info = "DerryOK"
        getInfoMethod()
        // info = "DerryOK"
    }

    fun getInfoMethod() {
        println("info:${info[0]}")
    }

}

// TODO 81.Kotlin语言的初始化陷阱二学习
// 1.定义info
// 2.init getInfo
// 3.info = ""
fun main() {
    KtBase81().


        getInfoMethod()
}