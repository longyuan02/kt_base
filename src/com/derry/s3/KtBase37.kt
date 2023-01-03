package com.derry.s3

// TODO 37.在Kotlin中使用带let的安全调用
fun main() {
    var name: String? = null
    name = "Derry"
    name = ""

    // name是可空类型的 如果真的是null，?后面这一段代码不执行，就不会引发空指针异常
    val r =name?.let {
        // it == name 本身
        // 如果能够执行到这里面的，it 一定不为null

        if (it.isBlank()) { // 如果name是空值 "" 没有内容
            "Default"
        } else {
            "[$it]"
        }
    }
    println(r)
}