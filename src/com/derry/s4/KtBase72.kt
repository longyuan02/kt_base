package com.derry.s4

// 主构造函数：规范来说，都是增加_xxx的方式，临时的输入类型，不能直接用，需要接收下来 成为变量才能用
// _name 等等，都是临时的类型，不能直接要弄，需要转化一下才能用
class KtBase72(_name: String, _sex: Char, _age: Int, _info: String) // 主构造函数
{
    var name = _name
        get() = field // get不允许私有化
        private set(value) {
            field = value
        }

    val sex = _sex
        get() = field
        // set(value) {} 只读的，不能修改的，不能set函数定义

    val age: Int = _age
        get() = field + 1

    val info = _info
        get() = "【${field}】"

    fun show() {
        // println(_name) 临时的输入类型，不能直接用，需要接收下来 成为变量才能用
        println(name)
        println(sex)
        println(age)
        println(info)
    }
}

// TODO 72.Kotlin语言的主构造函数学习
fun main() {
    // KtBase72()

    val p = KtBase72(_name = "Zhangsan", _info = "学习KT语言", _age = 88, _sex = 'M')
    // println(p.name)
    // p.name = "AAA" 被私有化了，不能调用

    p.show()
}