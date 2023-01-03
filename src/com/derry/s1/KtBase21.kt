package com.derry.s1

// TODO 21.Kotlin语言的反引号中函数名特点
fun main() {
    // 第一种情况：
    `登录功能 2021年8月8日测试环境下 测试登录功能 需求编码人是Derry`("Derry", "123456")

    // 第二种情况：// in  is  在kt里面就是关键字，怎么办呢？ 使用反引号
    KtBase21.`is`()
    KtBase21.`in`()

    // 第三种情况： 很少发生
    `65465655475`()
}

private fun `登录功能 2021年8月8日测试环境下 测试登录功能 需求编码人是Derry`(name: String, pwd: String) {
    println("模拟：用户名是$name, 密码是:$pwd")
}

private fun `65465655475`() {
    // 写了很复杂的功能，核心功能
    // ...
}

// 公司加密私有的文档     65465655475  === 此函数的作用 xxxx
// 公司加密私有的文档     55576575757  === 此函数的作用 xxxx