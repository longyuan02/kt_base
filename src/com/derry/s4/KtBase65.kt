package com.derry.s4

import java.io.File

// TODO 65.Kotlin中的数组类型
/*
    Kotlin语言中的各种数组类型，虽然是引用类型，背后可以编译成Java基本数据类型
    IntArray        intArrayOf
    DoubleArray     doubleArrayOf
    LongArray       longArrayOf
    ShortArray      shortArrayOf
    ByteArray       byteArrayOf
    FloatArray      floatArrayOf
    BooleanArray    booleanArrayOf
    Array<对象类型>           arrayOf         对象数组
*/
// 1.intArrayOf 常规操作的越界奔溃
// 2.elementAtOrElse elementAtOrNull
// 3.List集合转 数组
// 4.arrayOf Array<File>
fun main() {
    // 1.intArrayOf 常规操作的越界奔溃
    val intArray /*: IntArray*/ = intArrayOf(1, 2, 3, 4, 5)
    println(intArray[0])
    println(intArray[1])
    println(intArray[2])
    println(intArray[3])
    println(intArray[4])
    // println(intArray[5]) // 奔溃：会越界异常

    println()

    // 2.elementAtOrElse elementAtOrNull
    println(intArray.elementAtOrElse(0) { -1 })
    println(intArray.elementAtOrElse(100) { -1 })

    println(intArray.elementAtOrNull(0))
    println(intArray.elementAtOrNull(200))

    // OrNull + 空合并操作符 一起来用
    println(intArray.elementAtOrNull(666) ?: "你越界啦啊啊啊")

    println()

    // 3.List集合转 数组
    val charArray /*: CharArray*/ = listOf('A', 'B', 'C').toCharArray()
    println(charArray)

    // 4.arrayOf Array<File>
    val objArray /*: Array<File>*/ = arrayOf(File("AAA"), File("BBB"), File("CCC"))
}