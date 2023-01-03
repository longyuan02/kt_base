package com.derry.s3

import kotlin.math.roundToInt

// TODO 49.Kotlin语言中Double转Int与类型格式化
// 65.4645654 65.8343433
fun main() {
    println(65.4645654.toInt()) // 65 四舍五入

    println(65.4645654.roundToInt())  // 65 四舍五入

    println(65.8343433.roundToInt()) // 66 四舍五入

    // 结论：用 roundToInt()函数，保证 Double ->转Int 持有四舍五入的效果

    // r的类型： String
    val r  = "%.3f".format(65.8343433)
    println(r)

}