package com.derry.s1

// TODO 14.Kotlin语言的when表达式
fun main() {
    val week = 2

    // Java的 if 语句
    // KT的 if 是表达式 有返回值的

    val info = when(week) {
        1 -> "今天是星期一，非常忙碌的一天开会"
        2 -> "今天是星期二，非常辛苦的写需求"
        3 -> "今天是星期三，努力写Bug中"
        4 -> "今天是星期四，发布版本到凌晨"
        5 -> "今天是星期五，淡定喝茶，一个Bug改一天"
        6 -> "今天是星期六，稍微加加班"
        7 -> "今天是星期七，看剧中，游玩中"
        else -> {
            println("养猪去了，忽略星期几")
        }
    }
    println(info) // void 关键字 无返回    用Unit类代替了java的void关键字
//    println(whenTest(week))
}
fun whenTest(week:Int):Any{
    val info = when(week){
        1->"今天是星期一"
        2->"今天是星期二"
        3->"今天是星期三"
        4->"今天是星期四"
        5->"今天是星期五"
        else->{
            "今天是周末"
        }
    }
    return info
}