package com.derry.s6.com.derry

// 1.扩展文件一般都是public，如果private外界无法使用
// 2.Iterable<E> 子类 set list 都可以用，所以用父类
// 3.本次扩展函数的作用是，随机取第一个元素返回
fun <E> Iterable<E>.randomItemValue() = this.shuffled().first()

fun <T> Iterable<T>.randomItemValuePrintln() = println(this.shuffled().first())