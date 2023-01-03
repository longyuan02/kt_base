package com.derry.s1

// TODO 15.Kotlin语言的String模版
fun main() {
    val garden = "黄石公园"
    val time = 6
//
    println("今天天气很晴朗，去玩" + garden + "，玩了" +time +" 小时") // Java的写法
    println("今天天气很晴朗，去${garden}玩，玩了$time 小时") // 字符串模版的写法

    // KT的if是表达式，所以可以更灵活，  Java的if是语句，还有局限性
    val isLogin = false
    println("server response result: ${if (isLogin) "恭喜你，登录成功√" else "不恭喜，你登录失败了，请检查Request信息"}")
//    mould()
}
fun mould():Unit{
    val garden = "黄石公园"
    println("今天去${garden}玩")
    //判断
    val isLogin = false
//        println("server response result: ${if (isLogin) "恭喜你，登录成功√" else "不恭喜，你登录失败了，请检查Request信息"}")
    println("server response result:${if(isLogin)"111" else "222" }")
    println("edfdf ${if (isLogin)"可以" else "no"}")

}