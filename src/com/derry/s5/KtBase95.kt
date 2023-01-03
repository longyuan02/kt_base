package com.derry.s5

// KT想表达：枚举其实也是一个class，为什么，就是为了 枚举可以有更丰富的功能
enum class Week {
    星期一,
    星期二,
    星期三,
    星期四,
    星期五,
    星期六,
    星期日
}

// TODO 95-Kotlin语言的枚举类学习
fun main() {
    println(Week.星期一)
    println(Week.星期四)

    // 枚举的值 等价于 枚举本身
    println(Week.星期二 is Week)
}