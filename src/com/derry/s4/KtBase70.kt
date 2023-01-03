package com.derry.s4

class KtBase70 {
    var name = "Derry"
        get() = field
        set(value) {
            field = value
        }
    /* 背后做的事情：

       @NotNull
       private String name = "Derry";

       public void setName( @NotNull String name) {
            this.name = name;
       }

       @NotNull
       public String getName() {
            return this.name;
       }

     */

    var value = "ABCDEFG"
        // 下面的隐式代码，不写也有，就是下面这个样子
        get() = field
        set(value) {
            field = value
        }

    var info = "abcdefg ok is success"
        get() = field.capitalize() // 把首字母修改成大写
        set(value) {
            field = "**【$value】**"
        }
    /* 背后做的事情：

        @NotNull
        private String info = "abcdefg ok is success";

        public void setInfo( @NotNull String info) {
            this.info = "**【" + info + "】**";
        }

        @NotNull
        public String getInfo() {
            return StringKt.capitalize(this.info)
        }

     */
}

// public final class KtBase70Kt { 下面的main函数 }

// TODO 70.Kotlin语言的定义类与field关键字学习
fun main() {
    // 背后隐式代码：new KtBase70().setName("Kevin");
    KtBase70().name = "Kevin"
    // 背后隐式代码：System.out.println(new KtBase70().getName());
    println(KtBase70().name)


    println(">>>>>>>>>>>>>>>>>>")


    // 背后隐式代码：System.out.println(new KtBase70().getInfo());
    println(KtBase70().info)

    // 背后隐式代码：new KtBase70().setInfo("学习KT");
    KtBase70().info = "学习KT"
}