package com.derry.s4

// TODO 68.Kotlin语言的遍历Map学习
// 四种方式遍历
fun main() {
    val map /*: Map<String, Int>*/ = mapOf(Pair("Derry", 123), Pair("Kevin", 456), "Leo" to 789)

    // 第一种方式:
    map.forEach {
        // it 内容 每一个元素 (K 和 V)  每一个元素 (K 和 V)  每一个元素 (K 和 V)
        // it 类型  Map.Entry<String, Int>
        println("K:${it.key} V:${it.value}")
    }

    println()

    // 第二种方式：
    map.forEach { key: String, value: Int ->
        // 把默认的it给覆盖了
        println("key:$key, value:$value")
    }

    println()

    // 第三种方式：
    map.forEach { (k /*: String*/, v /*: Int*/) ->
        println("key:$k, value:$v")
    }

    println()

    // 第四种方式：
    for (item /*: Map.Entry<String, Int>*/ in map) {
        // item 内容 每一个元素 (K 和 V)  每一个元素 (K 和 V)  每一个元素 (K 和 V)
        println("key:${item.key} value:${item.value}")
    }

}