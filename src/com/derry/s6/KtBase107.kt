package com.derry.s6

// 纠正： 为什么 it 是 String ? , 是因为你的  lambda (T ?) -> O  T? 指定了 ？
class KtBase107<T> (vararg objects : T, var isMap: Boolean) {

    // 1.objectArray:Array<T>
    // out 我们的T只能被 读取，不能修改   T只能读取
    private val objectArray : Array<out T> = objects

    // 2.showObj(index)  "你${index}下标去的对象是null"
    fun showObj(index: Int) : T? = objectArray[index].takeIf { isMap } ?: null /*objectArray[index]*/

    // 3.mapObj(index, 变换lambda)   objectArray[index]
    fun <O> mapObj(index: Int, mapAction: (T ?) -> O)  = mapAction( objectArray[index].takeIf { isMap }  /*objectArray[index]*/ )
}

// TODO 107-Kotlin语言的vararg关键字(动态参数)
// 1.objectArray:Array<T>
// 2.showObj(index)
// 3.mapObj(index,变换lambda)
// 4.p.showOBj  p.mapObj(int -> str)
// 5.p的类型  it的类型
fun main() {
    // * Java ?
    // p的类型 ?

    // 由于你使用的 太多类型的混合了，泛型 这个才是他真正的类型 : KtBase107<{Comparable<*> & java.io.Serializable}>
    //  由于不允许我们这样写 : KtBase107<{Comparable<*> & java.io.Serializable}> 所以我们用父类 Any? 代替
    val p : KtBase107<Any?>  = KtBase107("Derry", false, 53454, 4543.3f, 4554.54, null, 'C', isMap = true)

    println(p.showObj(0))
    println(p.showObj(1))
    println(p.showObj(2))
    println(p.showObj(3))
    println(p.showObj(4)) // 4554.54
    println(p.showObj(5)/*?.特殊操作 如果是null 会引发奔溃*/) // null
    println(p.showObj(6)) // C

    println()

    // mapObj
    // it的类型  实际上 真正的类型 {Comparable<*> & java.io.Serializable}  需要转换一下才行 例如：it.toString
    val r : Int = p.mapObj(0) {
        it
        it.toString()
        it.toString().length
    }
    println("第零个元素的字符串长度是:$r")

    // it的类型  实际上 真正的类型 {Comparable<*> & java.io.Serializable}  由于我们的第三个元素是 Int类型，所以不需要转换，自动转的
    val r2 : String = p.mapObj(2) {
        "我的第三个元素是:$it"
    }
    println(r2)

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    val p2 : KtBase107<String> = KtBase107("AAA", "BBB", "CCC", isMap = true)
    val r3 = p2.mapObj(2) {
        it
        // it 是什么类型 ？  String ?
        "我要把你变成String类型 it:$it"
    }
    println(r3)
}