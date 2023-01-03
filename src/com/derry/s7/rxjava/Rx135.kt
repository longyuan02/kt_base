package com.derry.s7.rxjava

// 手写RxJava，全部用KT的基础来写
fun main() {
    // create 输入源，没有任何参数给你，  输出源：你是输出就行（所有类型，万能类型）
    // map 输入源 就是create的输出源的valueItem，  输出源：你是输出就行（所有类型，万能类型）
    // observer 输入源 就是 map 存储的 valueItem，  消费完成就行，全部结束

    create {
        // .... 省略 ，万能类型，几百种类型，其实都一样的
        "Derry"
        123
        true
        "AAAAAAAA"
        5435.54f // 最后一行
    }.map {
        "你的值是:$this" // 最后一行
    }.map {
        "[$this]"
    }.map {
        "@@$this@@"
    }.observer {
        // 只需要把上面输入的内容，打印输出即可，所以不需要管输出
        println(this)
    }
}

// 中转站，保存我们的记录  // valueItem == create操作符 最后一行的返回值 流向此处了
class RxJavaCoreClassObject<T>(var valueItem : T) // 主构造，接收你传递进来的信息，此消息就是create最后一行的返回

inline fun <I> RxJavaCoreClassObject<I>.observer ( observerAction : I.() -> Unit ) = observerAction(valueItem)

inline fun<I, O> RxJavaCoreClassObject<I>.map(mapAction : I.() -> O) = RxJavaCoreClassObject(mapAction(valueItem))

inline fun <OUTPUT> create(action : () -> OUTPUT) = RxJavaCoreClassObject((action()))

/**
 *   140 个视频 Derry主动给大家增加的录制的，送给大家的礼物
 *   NDK主动增加两个月课
 *   ...
 */
