package com.derry.s4

// TODO 69.Kotlin语言的可变Map集合学习
// 1.可变集合的操作 += [] put
// 2.getOrPut 没有的情况
// 3.getOrPut 有的情况
fun main() {
    // 1.可变集合的操作 += [] put
    val map : MutableMap<String, Int> = mutableMapOf(Pair("Derry", 123), "Kevin" to 456, Pair("Dee", 789))
    // 下面是可变操作
    map += "AAA" to(111)
    map += "BBB" to 1234
    map -= "Kevin"
    map["CCC"] = 888
    map.put("DDD", 999) // put 和 [] 等价的

    // 2.getOrPut 没有有的情况
    // 如果整个map集合里面没有 FFF的key 元素，我就帮你先添加到map集合中去，然后再从map集合中获取
    val r: Int = map.getOrPut("FFF") { 555 }
    println(r)
    println(map["FFF"]) // 他已经帮你加入进去了，所以你可以获取

    // 3.getOrPut 有的情况
    val r2 = map.getOrPut("Derry") {666} // 发现Derry的key是有的，那么就直接获取出来， 相当于666备用值就失效了
    println(r2)
}