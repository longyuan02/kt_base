package com.derry.s2

// TODO 30.Kotlin语言的简略写法学习
fun main() {
    // 第一种方式
    loginAPI2("Derry", "123456", { msg: String, code:Int ->
        println("最终登录的情况如下: msg:$msg, code:$code")
    })

    // 第二种方式
    loginAPI2("Derry", "123456", responseResult = { msg: String, code: Int ->
        println("最终登录的情况如下: msg:$msg, code:$code")
    })

    // 第三种方式
    loginAPI2("Derry", "123456") { msg: String, code: Int ->
        println("最终登录的情况如下: msg:$msg, code:$code")
    }
}

// 模拟：数据库SQLServer
const val USER_NAME_SAVE_DB2 = "Derry"
const val USER_PWD_SAVE_DB2 = "123456"

// 登录API 模仿 前端
public fun loginAPI2(username: String, userpwd: String, responseResult: (String, Int) -> Unit) {
    if (username == null || userpwd == null) {
        TODO("用户名或密码为null") // 出现问题，终止程序
    }

    // 做很多的校验 前端校验
    if (username.length > 3 && userpwd.length > 3) {
        if (wbeServiceLoginAPI2(username, userpwd)) {
            // 登录成功
            // 做很多的事情 校验成功信息等
            // ...
            responseResult("login success", 200)
        } else {
            // 登录失败
            // 做很多的事情 登录失败的逻辑处理
            // ...
            responseResult("login error", 444)
        }
    } else {
        TODO("用户名和密码不合格") // 出现问题，终止程序
    }
}

// 登录的API暴露者 服务器
private fun wbeServiceLoginAPI2(name: String, pwd: String) : Boolean {
    // kt的if是表达式(很灵活)     java的if是语句(有局限性)

    // 做很多的事情 登录逻辑处理
    // ...

    return if (name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB) true else false
}