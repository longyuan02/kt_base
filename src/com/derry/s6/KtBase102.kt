package com.derry.s6

abstract class BaseActivity {

    fun onCreate() {
        setContentView(getLayoutID())

        initView()
        initData()
        initXXX()
    }

    private fun setContentView(layoutID: Int) = println("加载{$layoutID}布局xml中")

    abstract fun getLayoutID(): Int
    abstract fun initView()
    abstract fun initData()
    abstract fun initXXX()
}

class MainActivity : BaseActivity() {

    override fun getLayoutID(): Int = 564

    override fun initView() = println("做具体初始化View的实现")

    override fun initData() = println("做具体初始化数据的实现")

    override fun initXXX() = println("做具体初始化XXX的实现")

    fun show() {
        super.onCreate()
    }
}

class LoginActivity : BaseActivity() {

    override fun getLayoutID(): Int = 564

    override fun initView() = println("做具体初始化View的实现")

    override fun initData() = println("做具体初始化数据的实现")

    override fun initXXX() = println("做具体初始化XXX的实现")

    fun show() {
        super.onCreate()
    }
}

// TODO 102-Kotlin语言的抽象类学习
fun main() = LoginActivity().show()