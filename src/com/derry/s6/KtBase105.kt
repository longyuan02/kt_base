package com.derry.s6

// 1.类 isMap map takeIf  map是什么类型
class KtBase105<T>(val isMap: Boolean = false, val inputType: T) {

    // 模仿RxJava  T是要变化的输入类型   R是变换后的输出类型
    // 要去map返回的类型是 R?  == 有可能是R 有可能是null
    inline fun <R> map(mapAction: (T) -> R) = mapAction(inputType).takeIf { isMap }
}

inline fun <I, O> map(inputValue : I , isMap: Boolean = true, mapActionLambda : (I) -> O) =
    if (isMap) mapActionLambda(inputValue) else null

// TODO 105-Kotlin语言的泛型变换实战
// 1.类 isMap map takeIf  map是什么类型
// 2.map int -> str 最终接收是什么类型
// 3.map per -> stu 最终接收是什么类型
// 4.验证是否是此类型 与 null
fun main() {

    // 2.map int -> str 最终接收是什么类型
    val p1 = KtBase105(isMap = /*true*/ false, inputType = 5434)

    val r = p1.map {
        it
        it.toString() // lambda最后一行是 返回值
        "我的it是:$it" // lambda最后一行是 返回值
    }

    // 4.验证是否是此类型 与 null
    val str1: String = "OK1"
    val str2: String? = "OK2"
    println(r is String)
    println(r is String?)
    println(r ?: "大哥你是null，你在搞什么飞机...,你是不是传入了isMap是false")

    println()

    // 3.map per -> stu 最终接收是什么类型
    val p2 = KtBase105(true, Persons("李四", 99))
    val r2 : Students? = p2.map {
        // it == Persons对象 == inputType
        it
        Students(it.name, it.age)
    }
    println(r2)

    println()

    // map函数 模仿RxJava变换操作
    val r3 = map(123) {
        it.toString()
        "map包裹[$it]" // lambda表达式最后一行，就是返回值
    }
    println(r3)

    123.run {  }
}

data class Persons(val name: String, val age: Int)
data class Students(val name: String, val age: Int)