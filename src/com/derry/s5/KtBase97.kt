package com.derry.s5

enum class Exam {
    Fraction1, // 分数差
    Fraction2, // 分数及格
    Fraction3, // 分数良好
    Fraction4, // 分数优秀

    ; // 枚举结束

    // 需求 得到优秀的孩子姓名
    var studentName: String? = null
    // 我们用枚举类，要做到此需求，就非常的麻烦了，很难做到而已，不是做不到
    //  需求：引出 密封类
}

class Teacher (private val exam: Exam) {
    fun show() =
        when (exam) {
            Exam.Fraction1 -> "该学生分数很差"
            Exam.Fraction2 -> "该学生分数及格"
            Exam.Fraction3 -> "该学生分数良好"
            Exam.Fraction4 -> "该学生分数优秀"
            // else -> 由于我们的show函数，是使用枚举类类型来做判断处理的，这个就属于 代数数据类型，就不需要写 else 了
            // 因为when表达式非常明确了，就只有 四种类型，不会出现 else 其他，所以不需要写
        }
}

// TODO 97-Kotlin语言的代数数据类型
// 1.定义枚举Exam类，四个级别分数情况
// 2.定义Teacher老师类，when使用枚举类
// 3.需求 得到优秀的孩子姓名
fun main() {
    println(Teacher(Exam.Fraction1).show())
    println(Teacher(Exam.Fraction3).show())
}