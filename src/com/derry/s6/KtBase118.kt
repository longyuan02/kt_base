package com.derry.s6

// 对 String?==可空类型的 进行函数扩展，并且有备用值
fun String?.outputStringValueFun(defalutValue : String) = println(this ?: defalutValue)

// 编译期非常智能：能够监测到你做了if判断（能够对你代码逻辑监测），就知道后续类型
fun String?.outputStringValueFunGet(defaultValue : String) = if (this == null) defaultValue else this

// TODO 118-Kotlin语言的可空类型扩展函数
// 如果是null，就输出默认值
fun main() {
    val infoValue : String ? = null // infoValue是可空的类型  String  String?==可空类型的
    infoValue.outputStringValueFun("我是默认值啊1")

    // String? 前面已经说过了，可以接收 可空数据  也可以接收 有值数据
    // String  前面已经说过了，只能接收 有值数据
    val name = "Derry"
    name.outputStringValueFun("我是默认值啊2")

    // >>>>>>>>>>>>>>
    println(infoValue.outputStringValueFunGet("我是默认值啊3"))
    println(name.outputStringValueFunGet("我是默认值啊4"))
}