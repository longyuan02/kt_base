package com.derry.s4

class KtBase82 (_info: String) {
    private val info = _info

    val content : String = getInfoMethod()

    // private val info = _info // 把这种 转换info的代码，写到最前面，这样保证，就不会出现这种问题

    private fun getInfoMethod() = info // 当此函数调用info变量的时候，你以为是赋值好了，但是还没有赋值
}

// TODO 82Kotlin语言的.初始化陷阱三学习
// 1.主构造 _info 放后面
// 2.value = initInfoActin() 放前面
// 3.p.value.length
fun main() {
    println("内容的长度是:${KtBase82("Derry").content.length}")
}