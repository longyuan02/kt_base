package com.derry.s6

// 1.定义3个Obj类
data class ObjectClass1(val name: String, val age: Int, val study: String)
data class ObjectClass2(val name: String, val age: Int, val study: String)
data class ObjectClass3(val name: String, val age: Int, val study: String)

class KtBase112 {

    // 所有的功能，写在函数上
    // 默认随机输出一个对象，如果此对象和用户指定的对象不一致，我们就启用备用对象，否则就直接返回对象
    inline fun <reified T> randomOrDefault(defaultLambdaAction: () -> T ) :T? {
        val objList : List<Any> = listOf(ObjectClass1("obj1 李四", 22, "学习C"),
                                         ObjectClass2("obj2 王五", 23, "学习C++"),
                                         ObjectClass3("obj3 赵六", 24, "学习C#"))

        val randomObj : Any? = objList.shuffled().first()

        println("您随机产生的对象 幸运儿是:$randomObj")

        // return randomObj.takeIf { it is T } as T ?: null     :T? {

        // T  与  T?  是不同的 ？
        // 答： it is T false  takeIf  null    null as T 奔溃了，解决思路： null as T?

        // 如果  it随机产生的对象 等于 T类型的，就会走 as T 直接返回了
        return randomObj.takeIf { it is T } as T?  // null as T     null as T?
            // 如果  it随机产生的对象 不等于 T类型的，就会走下面这个备用环节
            ?: defaultLambdaAction()
    }

}

// TODO 112-Kotlin语言的reified关键字学习
// 1.定义3个Obj类
// 2.randomOrDefault函数 备用机制的lambda
// 3.lists.shuffled()
fun main() {
    val finalResult = KtBase112().randomOrDefault<ObjectClass1> {
        println("由于随机产生的对象 和 我们指定的ObjectClass1不一致，所以启用备用对象")
        ObjectClass1("备用 obj1 李四", 22, "学习C") // 最后一行的返回
    }
    println("客户端最终结果:$finalResult")
}