package com.derry.s6

import java.io.File

class Context {

    val info = "我就是Derry"
    val name = "DDD"

    fun toast(str: String) = println("toast:$str")
}

inline fun Context.apply5(lambda: Context.(String) -> Unit): Context {
    lambda(info)
    return this
}

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
inline fun File.applyFile(action: (String, String?) -> Unit): File {
    setWritable(true)
    setReadable(true)
    action(name, readLines()[0])
    return this
}

// TODO 123-Kotlin语言的DSL学习
// DSL简介 所谓DSL领域专用语言(Domain Specified Language/ DSL)
fun main() {

    // 其实apply5函数，就是DSL编程范式，定义输入输出等规则：
    // 1.定义整个lambda规则标准，输入 必须是Context这个类，才有资格调用apply5函数，匿名函数里面持有it 和 this
    // 2.定义整个lambda规则标准，输出 我们会始终返回Context本身，所以你可以链式调用
    // 然后main函数就可以根据DSL编程方式标准规则，来写具体的实现，这就是DSL编程范式
    val context : Context = Context().apply5 {
        // it == String == "我就是Derry"
        println("我的it是:$it，我的this是:$this")
        toast("success")
        toast(it)
        toast(name)
        true
    }.apply5 { }.apply5 { }.apply5 { } // ...
    println()
    println("我始终是输出Context本身：" + context.info)

    println()

    // 其实applyFile函数，就是DSL编程范式，定义输入输出等规则：
    // 1.定义整个lambda规则标准，输入 必须是File类，才有资格调用applyFile函数，匿名函数里面持有 fileName，data
    // 2.定义整个lambda规则标准，输出 我们始终返回File对象本身，所以你可以链式调用
    // 然后main函数就可以根据DSL编程方式标准规则，来写具体的实现，这就是DSL编程范式
    val file: File = File("D:\\a.txt")
        .applyFile { fileName, data ->
            println("你的文件名是:$fileName, 你的文件里面的数据是:$data")
            println("你的文件名是:$fileName, 你的文件里面的数据是:$data")
            println("你的文件名是:$fileName, 你的文件里面的数据是:$data")
            true
        }.applyFile { a, b -> }.applyFile { a, b -> }.applyFile { a, b -> } // ...

    println("我始终是输出File本身：${file.name}")
}