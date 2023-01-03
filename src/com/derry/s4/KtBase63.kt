package com.derry.s4

// TODO 63.Kotlin语言的可变Set集合
fun main() {
   val set : MutableSet<String> = mutableSetOf("李元霸", "李连杰")
    set += "李俊"
    set += "李天"
    set -= "李连杰"
    set.add("刘军")
    set.remove("刘军")
    println(set)
}