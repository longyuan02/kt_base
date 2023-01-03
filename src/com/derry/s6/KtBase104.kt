package com.derry.s6

// 1.万能对象返回器 Boolean来控制是否返回 运用 takeIf
class KtBase104<T>(private val isR: Boolean, private val obj: T) {

    fun getObj() : T? = obj.takeIf { isR }

}

// TODO 104-Kotlin语言的泛型函数学习
// 1.万能对象返回器 Boolean来控制是否返回 运用 takeIf
// 2.四个对象打印
// 3.对象打印 + run + ?:
// 4.对象打印 + apply + ?:
// 5.show(t: T) + apply + ?:
fun main() {
    val stu1 = Student("张三", 88, '男')
    val stu2 = Student("李四", 78, '女')

    val tea1 = Teacher("王五", 77, '男')
    val tea2 = Teacher("赵六", 89, '女')

    // 2.四个对象打印
    println(KtBase104(true, stu1).getObj())
    println(KtBase104(true, stu2).getObj())
    println(KtBase104(true, tea1).getObj())
    println(KtBase104(true, tea2).getObj())

    println(KtBase104(false, tea2).getObj() ?: "大哥，你万能对象返回器，是返回null啊")

    println()

    // 3.对象打印 + run + ?:
    val r : Any = KtBase104(true, stu1).getObj() ?.run {
        // 如果 getObj 返回有值，就会进来
        // this == getObj本身
        println("万能对象是:$this") // 返回Unit
        545.4f // 返回Float
    } ?: println("大哥，你万能对象返回器，是返回null啊") // 返回Unit
    println(r)

    println()

    // apply特点：永远都是返回 getObj.apply  getObj本身
    val r2 : Student = KtBase104(true, stu2).getObj().apply {  }!!
    println("r2:$r2")

    // 4.对象打印 + apply + ?:
    val r3: Teacher = KtBase104(true, tea1).getObj() .apply {
        // this == getObj本身

        if (this == null) {
            println("大哥，你万能对象返回器，是返回null啊")
        } else {
            println("万能对象是:$this")
        }
    }!!
    println("r3:$r3")

    println()

    show("Derry")
    show("Kevin")
    show("OK")
    show(null)

    println()

    show2("Derry")
    show2("Kevin")
    show2("OK")
    show2(null)
}

// 5.show(t: T) + also + ?:
fun <B> show(item: B) {
    item ?.also {
        // it == item本身
        println("万能对象是:$it")
    } ?: println("大哥，你万能对象返回器，是返回null啊")
}

fun <B> show2(item: B) {
    // var r0 = item

    var r : B? = item ?.also {
       if (it == null) {
           println("大哥，你万能对象返回器，是返回null啊")
       } else {
           println("万能对象是:$it")
       }
    } ?: null
    println("show2: 你传递进来的r:$r")
}