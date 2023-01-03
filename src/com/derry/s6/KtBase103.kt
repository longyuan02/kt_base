package com.derry.s6

class KtBase103<T> (private val obj: T) { // 万能输出器
    fun show() = println("万能输出器:$obj")
}

data class Student(val name: String , val age: Int, val sex: Char)
data class Teacher(val name: String , val age: Int, val sex: Char)

// TODO 103-Kotlin语言的定义泛型类
// 1.定义 对象输出器 println(obj)
// 2.定义两个对象，三个属性
// 3.对象 String Int Double Float Char 等 测试 对象输出器
fun main() {
    val stu1 = Student("张三", 88, '男')
    val stu2 = Student("李四", 78, '女')

    val tea1 = Teacher("王五", 77, '男')
    val tea2 = Teacher("赵六", 89, '女')

    KtBase103(stu1).show()
    KtBase103(stu2).show()
    KtBase103(tea1).show()
    KtBase103(tea2).show()

    KtBase103(String("刘一".toByteArray())).show()

    KtBase103(575).show()
    KtBase103(53456.45).show()
    KtBase103(4645.5f).show()
    KtBase103('男').show()

}