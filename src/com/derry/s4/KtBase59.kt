package com.derry.s4

// TODO 59.Kotlin语言的mutator函数学习
// 1.mutator += -= 操作
// 2.removeIf
fun main() {
    // 1.mutator += -= 操作
    val list : MutableList<String> = mutableListOf("Derry", "DerryAll", "DerryStr", "Zhangsan")
    list += "李四" // mutator的特性 +=  -+ 其实背后就是 运算符重载而已
    list += "王五"
    list -= "Derry"
    println(list)

    // 2.removeIf
    // list.removeIf { true } // 如果是true 自动变量整个可变集合，进行一个元素一个元素的删除
    list.removeIf { it.contains("Derr") } // 过滤所有的元素，只要是有 Derr 的元素，就是true 删除
    println(list)
}