package com.derry.s4

class KtBase71 {
    val number : Int = 0
    /* 背后的代码：

       private int number = 0;

       public int getNumber() {
            return this.number;
       }

     */

    // 计算属性  下面这样写 get函数覆盖了 field 内容本身，相当于field失效了，无用了，以后用不到了
    val number2 : Int
        get() = (1..1000).shuffled().first() // 从1到1000取出随机值 返回给 getNumber2()函数
    /*
        背后隐式代码：

        为什么没有看到 number2 属性定义？
        答：因为属于 计算属性 的功能，根本在getNumber2函数里面，就没有用到 number2属性，所以 number2属性 失效了，无用了，以后用不到了

         public int getNumber2() {
            return (1..1000).shuffled().first()java的随机逻辑 复杂 ;
       }
     */

    var info: String ? = null // ""

    // 防范竞态条件  当你调用成员，这个成员，可能为null，可能为空值，就必须采用 防范竞态条件，这个是KT编程的规范化
    fun getShowInfo() : String {

        // 这个成员，可能为null，可能为空值，就启用 防范竞态条件
        // 这种写法，就属于 防范竞态条件，我们可以看到专业的KT开发者，有大量这种代码
        // also永远都是返回 info本身
        return info?.let {
            if (it.isBlank()) {
                "info你原来是空值，请检查代码..." // 是根据匿名函数最后一行的变化而变化
            } else {
                "最终info结果是:$it" // 是根据匿名函数最后一行的变化而变化
            }
        } ?: "info你原来是null，请检查代码..."
    }
}

// TODO 71.Kotlin语言的 计算属性 与 防范竞态条件
fun main() {
    // 背后隐式代码：System.out.println(new KtBase71().getNumber());
    println(KtBase71().number)

    // 背后隐式代码：new KtBase71().setNumber(9);
    // KtBase71().number = 9 // val 根本就没有 setXXX函数，只有 getXXX函数

    // 背后隐式代码：System.out.println(new KtBase71().getNumber2());
    println(KtBase71().number2)

    // 背后隐式代码：System.out.println(new KtBase71().getShowInfo());
    println(KtBase71().getShowInfo())
}