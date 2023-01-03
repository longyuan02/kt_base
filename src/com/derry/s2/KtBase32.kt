package com.derry.s2

// TODO 32.Kotlin语言的函数引用学习
fun main() {
    // 函数引用
    // lambda属于函数类型的对象，需要把methodResponseResult普通函数变成 函数类型的对象（函数引用）

    // login("Derry2", "123456", ::methodResponseResult)

    val obj = ::methodResponseResult
    val obj2 = obj
    val obj3 =  obj2

    login("Derry", "123456", obj3)
}

fun methodResponseResult(msg: String, code: Int) {
    println("最终登录的成果是:msg:$msg, code:$code")
}


// 模拟：数据库SQLServer
const val USER_NAME_SAVE_DB4 = "Derry"
const val USER_PWD_SAVE_DB4= "123456"

inline fun login(name: String, pwd: String, responseResult: (String, Int) -> Unit) {
    if (USER_NAME_SAVE_DB4 == name && USER_PWD_SAVE_DB4 == pwd) {
        // 登录成功
        // 做很多的事情 校验成功信息等
        responseResult("登录成功", 200)
        // ...
    } else {
        // 登录失败
        // 做很多的事情 登录失败的逻辑处理
        // ...
        responseResult("登录失败错了", 444)
    }
}