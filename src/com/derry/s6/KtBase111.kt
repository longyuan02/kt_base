package com.derry.s6

// in T  out T 声明处指定关系  声明处泛型  这个是Java没有的功能

// 整个 SetClass 里面的所有成员 泛型相关，只能修改 更改，
//                                    不能获取人家 读取人家的
// 小结：当我们 对这个整个类里面的泛型，只能修改 ，不能让外界读取时，可以声明 in T 逆变
class SetClass<in T>() {

    // 200个函数 这200个函数 对T只能修改，不能给外界读取
    // ...

    fun set1(item: T) {
        println("set1 你要设置的item是:$item")
    }

    fun set2(item: T) {
        println("set2 你要设置的item是:$item")
    }

    fun set3(item: T) {
        println("set3 你要设置的item是:$item")
    }

    // ...

    // 不能给外界读取 (增加in后，不能给外界读取，所以编译不通过)
    /*fun get1() : T? {
        return null
    }

    fun get2() : T? {
        return null
    }

    fun get3() : T? {
        return null
    }*/

    // ...
}


// 整个 GetClass 里面的所有成员 泛型相关，不能修改 更改，
//                                    只能获取人家 读取人家的
// 小结：当我们 对这个整个类里面的泛型，只能给读取 ，不能修改 更改，可以声明 out T 协变
class GetClass<out T>(_item: T) {

    val item: T = _item

    // 200个函数 这200个函数 对T只能读取，不能给外界修改 更改
    // ...

    // 不能给外界修改 更改 (增加out后，不能给外界修改 更改，所以编译不通过)
    /*fun set1(item : T) {
        println("set1 你要设置的item是:$item")
    }

    fun set2(item : T) {
        println("set2 你要设置的item是:$item")
    }

    fun set3(item : T) {
        println("set3 你要设置的item是:$item")
    }*/

    // ...


    fun get1(): T {
        return item
    }

    fun get2(): T {
        return item
    }

    fun get3(): T? {
        return item
    }

    // ...
}

// TODO 111-Kotlin语言中使用in和out
fun main() {
    // 逆变 in T  SetClass 只能修改 更改 不能给外界读取
    val p1 = SetClass<String>()
    p1.set1("Derry")
    p1.set2("Kevin")

    println()

    // 协变 out T GetClass 只能读取，不能修改 更改
    val p2 = GetClass("李四")
    println(p2.get1())
    val p3 = GetClass("王五")
    println(p3.get3())
}