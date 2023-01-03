package com.derry.s5

class KtBase89 {

    // 伴生对象
    companion object {
        val info = "DerryINfo"

        fun showInfo() = println("显示:$info")

        val name = "Derry"
    }

    /* companion object {} 背后的逻辑

       private static final String name = "Derry";
       private static final String info = "DerryINfo";
       public static final KtBase89.Companion Companion = new KtBase89.Companion(xxx);

       public static final class Companion {

          @NotNull
          public final String getInfo() {
             return KtBase89.info;
          }

          @NotNull
          public final String getName() {
             return KtBase89.name;
          }

          public final void showInfo() {
             String var1 = "显示:" + ((KtBase89.Companion)this).getInfo();
             boolean var2 = false;
             System.out.println(var1);
          }

          private Companion() {}

          // $FF: synthetic method
          public Companion(DefaultConstructorMarker $constructor_marker) {
             this();
          }
        }

     */
}

// TODO 89.Kotlin语言的伴生对象学习
// 伴生对象的由来： 在KT中是没有Java的这种static静态，伴生很大程度上和Java的这种static静态 差不多的
// 无论 KtBase89() 构建对象多少次，我们的伴生对象，只有一次加载
// 无论 KtBase89.showInfo() 调用多少次，我们的伴生对象，只有一次加载
// 伴生对象只会初始化一次
fun main() {
    // 背后代码：System.out.println(KtBase89.Companion.getInfo())
    println(KtBase89.info)

    // 背后代码：System.out.println(KtBase89.Companion.getName())
    println(KtBase89.name)

    // 背后代码：KtBase89.Companion.showInfo()
    KtBase89.showInfo()

    // new KtBase89();
    KtBase89()
    KtBase89()
    KtBase89()
    KtBase89()
    // ...
}

