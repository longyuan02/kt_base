package com.derry.s1

// TODO 08.Kotlin语言的只读变量
fun main() {

    // var 默认提示：变量永远不会被修改，建议修改成 val == 不可改变的(只读)
    val info : String = "MhyInfo"
    // info = "AA" // 不能修改
    println(info)

    /*
      只读     变量名   类型   值
      val     age   : Int = 99
     */
    val age: Int = 99
    // age = 99 // 不能修改
    println(age)
}