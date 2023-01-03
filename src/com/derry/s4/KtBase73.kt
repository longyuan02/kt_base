package com.derry.s4

/* 伪代码：

class KtBase73 (_name: String, _sex: Char, _age: Int, _info: String)
{
    var name = _name
    val sex = _sex
    val age = _age
    var info = _info

    fun show() {
        println(name)
    }
}

 */

// var name: String  就相当于  var name = _name  这不过你看不到而已
// 一步到位，不像我们上一篇是分开写的
class KtBase73 (var name: String, val sex: Char, val age: Int, var info: String)
{
    fun show() {
        println(name)
        println(sex)
        println(age)
        println(info)
    }
}

// TODO 73.Kotlin语言的主构造函数里定义属性
fun main() {
    KtBase73(name = "Zhangsan", info = "学习KT语言", age = 88, sex = 'M').show()
}