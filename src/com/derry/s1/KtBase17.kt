package com.derry.s1

// TODO 17.Kotlin中函数参数的默认参数
const val maxAge:Int = 100
fun main() {
    action01("lisi", 89)
    action02("wangwu")
    action03()

    action03("赵六", 76)
    action007()
}

private fun action01(name: String, age: Int) {
    println("我的姓名是:$name, 我的年龄是:$age")
}

private fun action02(name: String, age: Int = 77) {
    println("我的姓名是:$name, 我的年龄是:$age")
}

private fun action03(name: String = "王五", age: Int = maxAge) {
    println("我的姓名是:$name, 我的年龄是:$age")
}
private fun action007(name:String = "测试",age:Int=101):Unit{
    print("我的姓名：$name,我的年龄是：$age")

}