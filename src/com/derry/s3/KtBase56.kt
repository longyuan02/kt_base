package com.derry.s3

// TODO 56.Kotlin语言的takeUnless内置函数
// takeIf 和 takeUnless 功能是相反的
// name.takeIf { true/false }  true:返回name本身，false返回null
// name.takeUnless { true/false }  false:返回name本身，true返回null

// 为什么有 takeUnless 的出现，一个 takeIf 不就够了吗？

class Manager {

    private var infoValue: String? = null

    fun getInfoValue() /* : String? */ = infoValue

    fun setInfoValue(infoValue: String) {
        this.infoValue = infoValue
    }
}

fun main() {
    val manager = Manager()

    /*
    "Derry".takeIf { *//*it == "Derry"*//* }
    "Derry".takeUnless { *//*it == "Derry"*//* }
    */

    // manager.setInfoValue("AAA")

    // 小结：takeUnless+it.isNullOrBlank() 一起使用，可以验证字符串有没有初始化等功能
    val r  = manager.getInfoValue().takeUnless { it.isNullOrBlank() } ?: "未经过任何初始化值"
    println(r)
}