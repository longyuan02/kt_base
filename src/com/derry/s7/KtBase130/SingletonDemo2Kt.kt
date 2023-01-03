package com.derry.s7.KtBase130

// 2.懒汉式的实现  KT版本
class SingletonDemo2Kt {

    companion object {

        private var instance : SingletonDemo2Kt? = null
            get() {
                if (field == null) {
                    field = SingletonDemo2Kt()
                }
                return field
            }

        fun getInstanceAction() = instance!!
    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo2Kt.getInstanceAction().show()
}