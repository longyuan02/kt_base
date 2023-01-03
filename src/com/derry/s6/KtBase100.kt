package com.derry.s6

interface IUSB {
    var usbVersionInfo: String // USB版本相关的信息
    var usbInsertDevice: String // USB插入的设备信息

    fun insertUBS() : String
}

// 鼠标UBS实现类
class Mouse(override var usbVersionInfo: String = "USB 3.0",
            override var usbInsertDevice: String = "鼠标接入了UBS口") :IUSB {

    override fun insertUBS() = "Mouse $usbVersionInfo, $usbInsertDevice"
}

// 键盘USB实现类
class KeyBoard : IUSB {

    override var usbVersionInfo: String = "USB 3.1"
        // 下面的 set get 都会持有 field，现在是你没有给 usbVersionInfo 赋值， 意味着field是没法让set/get持有的
        get() = field
        set(value) {
            field = value
        }

    override var usbInsertDevice: String = "键盘接入了UBS口"
        get() {
            println("@你get了[${field}]值出去了")
            return field
        }
        set(value) {
            field = value
            println("@你set了[${value}]值进来了")
        }

    override fun insertUBS(): String = "KeyBoard $usbVersionInfo, $usbInsertDevice"
}

// TODO 100-Kotlin语言的接口定义
// 1.接口里面的所有成员 和 接口本身 都是 public open 的，所以不需要open，这个是接口的特殊
// 2.接口不能有主构造，反正就是没有构造
// 3.实现类不仅仅要重写接口的函数，也要重写 接口的成员
// 4.接口实现代码区域，全部都要增加 override 关键字来修饰
fun main() {
    val iusb1 : IUSB = Mouse()
    println(iusb1.insertUBS())

    println()

    val iusb2: IUSB = KeyBoard()
    println(iusb2.insertUBS())

    iusb2.usbInsertDevice = "AAA"
}