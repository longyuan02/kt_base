package com.derry.s6

// 你必须把前面的普通方式学会：
val myStr : String = "AAA"
/* 背后代码：
   public final class KtBase117Kt {

       @NotNull
       private static final String myStr = "AAA";

       @NotNull
       public static final String getMyStr() {
            return myStr;
       }
   }
 */

// 扩展属性：
val String.myInfo: String
    get() = "Derry"

/* 背后代码：

   public final class KtBase117Kt {

       真实情况：
       @NotNull
       public static final String getMyInfo(@NotNull String $this$myInfo) {
          Intrinsics.checkParameterIsNotNull($this$myInfo, "$this$myInfo");
          return "Derry";
       }
   }

 */

// 打印输出 并且 链式调用 (只有String有资格这样)
fun String.showPrintln() : String {
    println("打印输出 并且 链式调用 (只有String有资格这样)：内容$this")
    return this
}

val String.stringAllInfoValueVal
    get() = "当前${System.currentTimeMillis()}这个时间点被调用了一次，当前的值是:$this，当前字符串长度是:$length"

// TODO 117-Kotlin语言的扩展属性
fun main() {
    val str : String = "ABC"
    println(str.myInfo)

    str.showPrintln().showPrintln().showPrintln().showPrintln()

    str.myInfo.showPrintln().showPrintln().showPrintln()

    "Derry老师".stringAllInfoValueVal // 扩展属性
        .showPrintln().showPrintln().showPrintln().showPrintln() // 扩展函数

}