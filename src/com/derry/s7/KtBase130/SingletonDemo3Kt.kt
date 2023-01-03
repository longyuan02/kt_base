package com.derry.s7.KtBase130

// 3.懒汉式的实现  KT版本 安全
class SingletonDemo3Kt {

    companion object {

        private var instance : SingletonDemo2Kt? = null
            get() {
                if (field == null) {
                    field = SingletonDemo2Kt()
                }
                return field
            }

        @Synchronized
        fun getInstanceAction() = instance!!
    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo3Kt.getInstanceAction().show()
}