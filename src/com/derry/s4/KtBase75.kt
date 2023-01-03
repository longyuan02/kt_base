package com.derry.s4

class KtBase75(name: String = "李元霸") // 主构造
{
    // 2个参数的次构造函数，必须要调用主构造函数
    constructor(name: String = "李连杰", sex: Char = 'M') : this(name) {
        println("2个参数的次构造函数 name:$name, sex:$sex")
    }

    // 3个参数的次构造函数，必须要调用主构造函数
    constructor(name: String = "李小龙", sex: Char = 'M', age: Int = 33) : this(name) {
        println("3个参数的次构造函数 name:$name, sex:$sex, age:$age")
    }

    // 4个参数的次构造函数，必须要调用主构造函数
    constructor(name: String = "李俊", sex: Char = 'W', age: Int = 87, info: String = "还在学校新开发语言") : this(name) {
        println("4个参数的次构造函数 name:$name, sex:$sex, age:$age, info:$info")
    }
}

// TODO 75.Kotlin语言的构造函数中默认参数学习
fun main() {
    val p = KtBase75("李元霸2") // 调用主构造

    KtBase75("张三", '男') // 调用 2个参数的次构造函数

    KtBase75("张三2", '男', 88) // 调用 3个参数的次构造函数

    KtBase75("张三3", '男', 78, "还在学校新语言") // 调用 4个参数的次构造函数

    KtBase75() // 到底是调用哪一个 构造函数，是次构造 还是 主构造 ？ 答：优先调用主构造函数
}