package com.derry.s7

class MyObject {

    companion object {

        @JvmField
        val TARGET = "黄石公园"

        @JvmStatic
        fun showAction(name: String) = println("$name 要去 $TARGET 玩")
    }

}

// TODO 134-注解@JvmStatic与Kotlin关系
fun main() {
    // KT 端
    MyObject.TARGET

    MyObject.showAction("Derry")
}