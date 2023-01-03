package com.derry.s3

// TODO 55.Kotlin语言的takeIf内置函数
// "欢迎登录系统,拥有超级权限"
fun main() {
    val result = checkPermissionAction("Root2", "!@#$")
    // println("欢迎${result}尊贵的用户欢迎登录系统,拥有超级权限")
    if (result != null) {
        println("欢迎${result}尊贵的用户欢迎登录系统,拥有超级权限")
    } else {
        println("你的权限不够")
    }

    // name.takeIf { true/false }
    // true: 直接返回name本身
    // false: 直接放回null

    // 真正的用途
    println(checkPermissionAction2("Root", "!@#$"))

    // 小结：一般大部分情况下，都是 takeIf + 空合并操作符 = 一起使用
}

// 前端
public fun checkPermissionAction(name: String, pwd: String) : String? {
    return name.takeIf { permissionSystem(name, pwd) }
}

// takeIf + 空合并操作符
public fun checkPermissionAction2(name: String, pwd: String) : String {
    return name.takeIf { permissionSystem(name, pwd) } ?: "你的权限不够"
}

// 权限系统
private fun permissionSystem(username: String, userpwd: String) : Boolean {
    return if (username == "Root" && userpwd == "!@#$") true  else false
}