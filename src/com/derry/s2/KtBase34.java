package com.derry.s2;

interface IShowResult { // 接口的折中方案 解决 kt的lambda问题
    void result(String result);
}

// TODO 34.Kotlin语言的匿名函数与具名函数
public class KtBase34 {

    public static void main(String[] args) { // psv
        // 匿名函数 - 匿名接口实现
        showPersonInfo("lisi", 99, 'm', "study cpp", new IShowResult() {
            @Override
            public void result(String result) {
                System.out.println("显示结果:" + result);
            }
        });

        // 具名函数 - 具名接口实现 showResultImpl
        IShowResult showResultImpl = new MshowResultImpl();
        showPersonInfo("wangwu", 88, 'n', "study kt", showResultImpl);
    }

   static class MshowResultImpl implements IShowResult {

        @Override
        public void result(String result) {
            System.out.println("显示结果:" + result);
        }
    }

    static void showPersonInfo(String name, int age, char sex, String study, IShowResult iShowResult) {
        String str = String.format("name:%s, age:%d, sex:%c, study:%s", name, age, sex, study);
        iShowResult.result(str);
    }

}
