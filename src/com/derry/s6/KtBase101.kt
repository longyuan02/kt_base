package com.derry.s6

interface USB2 {

    // 1.接口 var 也是不能给接口的成员赋值的 （但是有其他办法）
    // 2.任何类 接口 等等  val 代表只读的，是不可以在后面动态赋值 （也有其他办法）

    val usbVersionInfo: String // USB版本相关的信息
       get() = (1..100).shuffled().last().toString()
       // val 不需要set

    val usbInsertDevice: String // USB插入的设备信息
        get() = "高级设备接入USB"
        // val 不需要set

    fun insertUBS() : String
}

// 鼠标UBS实现类
class Mouse2 : USB2 {

    override val usbInsertDevice: String
        get() = super.usbInsertDevice

    override val usbVersionInfo: String
        get() = super.usbVersionInfo

    override fun insertUBS() = "Mouse $usbVersionInfo, $usbInsertDevice"
}

// TODO 101-Kotlin语言的接口的默认实现
// 1.注意：这样做是不对的，因为接口成员本来就是用来声明标准的
//        但是可以在接口成员声明时，完成对接口成员的实现
fun main() {
    val iusb1 = Mouse2()
    println(iusb1.insertUBS())
}