package com.derry.s3

// TODO 46.Kotlin语言的==与===比较操作
fun main() {
    // == 值 内容的比较  相当于Java的equals
    // === 引用的比较

    val name1 : String = "Derry"
    val name2 : String = "Derry"
    val name3 = "ww"

    // 小结：name1.equals(name2)  等价于 name1 == name2  都是属于 值 内容的比较
    println(name1.equals(name2)) // java
    println(name1 == name2) // kt

    // 引用的比较
    println(name1 === name2) // true
    println(name1 === name3) // false

    // 引用的比较 难度高一点点
    val name4 = "derry".capitalize() // 修改成"Derry"
    println(name4 === name1)
}