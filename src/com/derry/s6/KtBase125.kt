package com.derry.s6

// TODO 125-Kotlin语言的变换函数-flatMap
// map {返回类型：T String Int Boolean Char ...  是把每一个元素（String）加入到新集合，最后返回新集合 List<String>}
// flatMap {返回类型：每一个元素 T 集合1 集合2 集合3 ... 是把每一个元素（集合）加入到新集合，最后返回新集合 List<List<String>> 最终内部会处理成List<String>}

// TODO flatMap 相当于 List<List<String>> 集合的集合，有嵌套关系

fun main() {
    val list : List<String> = listOf("李四", "王五", "赵六", "初七")

    val newList : List<String> = list.map {
        "你的姓名是:$it" // 每次返回一个 String
    }.map {
        "$it, 你文字的长度是:${it.length}" // 每次返回一个 String
    }.flatMap {
        listOf("$it 在学习C++", "$it 在学习Java", "$it 在学习Kotlin") // 每次返回一个集合，四次
    }
    println(newList)

    println()

    /*
    [你的姓名是:李四, 你文字的长度是:8 在学习C++,
     你的姓名是:李四, 你文字的长度是:8 在学习Java,
     你的姓名是:李四, 你文字的长度是:8 在学习Kotlin,

     你的姓名是:王五, 你文字的长度是:8 在学习C++,
     你的姓名是:王五, 你文字的长度是:8 在学习Java,
     你的姓名是:王五, 你文字的长度是:8 在学习Kotlin,

     你的姓名是:赵六, 你文字的长度是:8 在学习C++,
     你的姓名是:赵六, 你文字的长度是:8 在学习Java,
     你的姓名是:赵六, 你文字的长度是:8 在学习Kotlin,

     你的姓名是:初七, 你文字的长度是:8 在学习C++,
     你的姓名是:初七, 你文字的长度是:8 在学习Java,
     你的姓名是:初七, 你文字的长度是:8 在学习Kotlin]
     */

    val newList2 : List<String> = list.flatMap {
        listOf("$it 在学习C++", "$it 在学习Java", "$it 在学习Kotlin")
    }
    println(newList2)
    //[李四 在学习C++,
    // 李四 在学习Java,
    // 李四 在学习Kotlin,
    // 王五 在学习C++,
    // 王五 在学习Java,
    // 王五 在学习Kotlin,
    // 赵六 在学习C++,
    // 赵六 在学习Java,
    // 赵六 在学习Kotlin,
    // 初七 在学习C++,
    // 初七 在学习Java,
    // 初七 在学习Kotlin]

    // 原理：就是把你 匿名函数 最后一行的返回值(又是一个集合listOf(......)) 加入一个新的集合，新集合的泛型是R，并且返回新集合
}