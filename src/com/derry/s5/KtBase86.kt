package com.derry.s5

// 在KT中，所有的类，都隐士继承了 : Any() ,你不写，默认就有
// Any类在KT设计中：只提供标准，你看不到实现，实现在各个平台处理好了
class Obj1 : Any()
class Obj2 : Any()
class Obj3 : Any()
class Obj4 : Any()
class Obj5 : Any()
class Obj6 : Any()
// ..

// TODO 86.Kotlin语言的Any超类学习
// Any == java Object
fun main() {
    println(Obj1().toString())
}
