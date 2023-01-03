package com.derry.s6

// TODO 116-Kotlin语言的标准函数与泛型扩展函数
fun main() {
    val r: Char = "Derry".mLet {
        it
        true
        "OK"
        'A'
    }

    123.mLet {
        it
    }

    'C'.mLet {
        it
    }

    // 万能类型，任何类型，所有类型，都可以使用我的 mLet
    // 省略几万行代码 ...

    val r2 : String = "Derry2".let {
        it
        34543.45f
        "Derry"
    }
}

// private 私有化
// inline  我们的函数是高阶函数，所以用到内联，做lambda的优化，性能提高
// fun<I, O> 在函数中，申明两个泛型，函数泛型  I输入Input， O输出Output
// I.mLet 对I输入Input进行函数扩展，扩展函数的名称是 mLet，意味着，所有的类型，万能类型，都可以用 xxx.mLet
// lambda : (I) -> O   (I输入参数) -> O输出
//  : O  会根据用户的返回类型，变化而变化
// lambda(this) I进行函数扩展，在整个扩展函数里面，this == I本身
private inline fun<I, O> I.mLet(lambda : (I) -> O) : O = lambda(this)