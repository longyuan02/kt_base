package com.derry.s5

// 密封类，我们成员， 就必须有类型 并且 继承本类
sealed class Exams {
    // object？ Fraction1 Fraction3 都不需要任何成员，所以一般都写成object，单例就单例，无所谓了
    object Fraction1 : Exams() // 分数差
    object Fraction2 : Exams() // 分数及格
    object Fraction3 : Exams() // 分数良好

    // 假设 Fraction4 是可以写object的，那么也不合理，因为对象不是单例的，有 对象1李四 对象2王五
    class Fraction4(val studentName : String) : Exams() // 分数优秀

    // 需求 得到优秀的孩子姓名
    // var studentName: String? = null
    // 我们用枚举类，要做到此需求，就非常的麻烦了，很难做到而已，不是做不到
    //  需求：引出 密封类
}

class Teachers (private val exam: Exams) {
    fun show() =
        when (exam) {
            is Exams.Fraction1 -> "该学生分数很差"
            is Exams.Fraction2 -> "该学生分数及格"
            is Exams.Fraction3 -> "该学生分数良好"
            is Exams.Fraction4 -> "该学生分数优秀：该学生的姓名是:${(this.exam as Exams.Fraction4).studentName}"
        }
}

// TODO 98-Kotlin语言的密封类学习
fun main() {
    println(Teachers(Exams.Fraction1).show())
    println(Teachers(Exams.Fraction2).show())
    println(Teachers(Exams.Fraction3).show())
    println(Teachers(Exams.Fraction4("李四")).show()) // 对象1
    println(Teachers(Exams.Fraction4("王五")).show()) // 对象2

    println(Exams.Fraction1 === Exams.Fraction1) // true, === 必须对象引用， object是单例 只会实例化一次

    println(Exams.Fraction4("AAA") === Exams.Fraction4("AAA")) // class 有两个不同的对象，所以是false
}