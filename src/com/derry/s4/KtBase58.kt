package com.derry.s4

// TODO 58.Kotlin语言的可变List集合学习
// 可变的集合
// 不可变集合 to 可变集合
// 可变集合 to 不可变集合
fun main() {
    // 可变的集合
    val list = mutableListOf("Derry", "Zhangsna", "Wangwu")
    // 可变的集合，可以完成可变的操作
    list.add("赵六")
    list.remove("Wangwu")
    println(list)

    // 不可变集合 to 可变集合
    val list2 = listOf(123, 456, 789)
    // 不可以的集合，无法完成可变的操作
    // list2.add
    // list2.remove

    val list3 : MutableList<Int> = list2.toMutableList()
    // 可变的集合，可以完成可变的操作
    list3.add(111)
    list3.remove(123)
    println(list3)

    // 可变集合 to 不可变集合
    val list4: MutableList<Char> = mutableListOf('A', 'B', 'C')
    // 可变的集合，可以完成可变的操作
    list4.add('Z')
    list4.remove('A')
    println(list4)

    val list5: List<Char> = list4.toList()
    // 不可以的集合，无法完成可变的操作
    /*list5.add
    list5.remove*/
}