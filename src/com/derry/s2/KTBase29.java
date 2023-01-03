package com.derry.s2;

interface ResponseResult {
    void result(String msg, int code);
}

public class KTBase29 {

    // 模拟：数据库SQLServer
    public final static String USER_NAME_SAVE_DB = "Derry";
    public final static String USER_PWD_SAVE_DB = "123456";

    public static void main(String[] args) {
        loginAPI("Derry2", "123456", new ResponseResult() {

            @Override
            public void result(String msg, int code) {
                System.out.println(String.format("最终登录的情况如下: msg:%s, code:%d", msg, code));
            }
        });
    }

    // 登录API 模仿 前端
    public static void loginAPI(String username, String userpwd, ResponseResult responseResult) {
        if (username == null || userpwd == null) {
            // TODO("用户名或密码为null") // 出现问题，终止程序
        }

        // 做很多的校验 前端校验
        if (username.length() > 3 && userpwd.length() > 3) {
            if (wbeServiceLoginAPI(username, userpwd)) {
                // 登录成功
                // 做很多的事情 校验成功信息等
                // ...
                responseResult.result("login success", 200);
            } else {
                // 登录失败
                // 做很多的事情 登录失败的逻辑处理
                // ...
                responseResult.result("login error", 444);
            }
        } else {
            // TODO("用户名和密码不合格") // 出现问题，终止程序
        }
    }

    // 登录的API暴露者 服务器
    private static boolean wbeServiceLoginAPI(String name, String pwd) {
        // kt的if是表达式(很灵活)     java的if是语句(有局限性)

        // 做很多的事情 登录逻辑处理
        // ...

        if (name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB)
            return true;
        else
            return false;
    }

}


