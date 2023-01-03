package com.derry.s4

class KtBase78 {

    // lateinit val AAA; // AAA 无法后面在修改了，我还怎么延时初始化？
    lateinit var responseResultInfo: String // 我等会儿再来初始化你，我先定义再说，所以没有赋值

    // 模拟服务器加载
    fun loadRequest() { // 延时初始化，属于懒加载，用到你在给你加载
        responseResultInfo = "服务器加载成功，恭喜你"
    }

    fun showResponseResult() {
        // 由于你没有给他初始化，所以只有用到它，就奔溃
        // if (responseResultInfo == null) println()
        // println("responseResultInfo:$responseResultInfo")

        if (::responseResultInfo.isInitialized) {
            println("responseResultInfo:$responseResultInfo")
        } else {
            println("你都没有初始化加载，你是不是忘记加载了")
        }
    }
}

// TODO 78.Kotlin语言的延迟初始化lateinit学习
// 1.lateinit responseResultInfo 定义
// 2.request 懒加载
// 3.showResponseResult
// 4.main 先请求 在显示
fun main() {
    val p = KtBase78()

    // 使用他之前，加载一下（用到它才加载，就属于，懒加载）
    p.loadRequest()

    // 使用他
    p.showResponseResult()
}