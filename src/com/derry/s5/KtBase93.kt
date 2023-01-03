package com.derry.s5

// 普通类
class Student1(var name: String , var age: Int, var sex: Char) {

    // 注意事项：component0 顺序必须是 component1 component2 component3 和成员一一对应，顺序下来的
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = sex
}

// 数据类
data class Student2Data(var name: String , var age: Int, var sex: Char)

// TODO 93.Kotlin语言的解构声明学习
fun main() {
    val(name, age, sex) = Student1("李四", 89, '男')
    println("普通类 结构后:name:$name, age:$age, sex:$sex")

    val(name1, age1, sex1) = Student2Data("李四", 89, '男')
    println("数据类 结构后:name:$name1, age:$age1, sex:$sex1")

    val(_, age2, _) = Student1("李四", 89, '男')
    println("数据类 结构后: age2:$age2")
}