package com.derry.s3

// TODO 39.Kotlin语法中对比使用if判断null值情况
fun main() {
    var name: String? = null
    name = "DDD"

    // name.capitalize() // name是可空类型的 可能是null，想要使用name，必须给出补救措施

    if (name != null) { // if也算是补救措施，和Java一样了
        val r = name.capitalize()
        println(r)
    } else {
        println("name is null")
    }
}