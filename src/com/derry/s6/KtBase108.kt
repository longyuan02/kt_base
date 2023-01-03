package com.derry.s6

class KtBase108 <INPUT> (vararg objects: INPUT, val isR: Boolean = true) {

    // 开启INPUT泛型的只读模式
    private val objectArray: Array<out INPUT> = objects

    // 1.5种返回类型变化的解释
    fun getR1() : Array<out INPUT> ? = objectArray.takeIf { isR }

    // 有可能是 Array<out INPUT>   也有可能是: String     就属于这种类型：Serializable， 用Any代替
    fun getR2() : Any = objectArray.takeIf { isR } ?: "你是null了"

    // 有可能是 Array<out INPUT>   也有可能是: String  也有可能是 ?   就属于这种类型：Serializable?  用Any?代替
    fun getR3() : Any? = objectArray.takeIf { isR } ?: "你是null了" ?: null

    fun getR4(index: Int) : INPUT ? = objectArray[index].takeIf { isR } ?: null

    // INPUT Float Int Char String ... = Any ?
    fun getR5(index: Int) : Any ? = objectArray[index].takeIf { isR } ?: "AAA" ?: 546 ?: 6445.546f ?: 'C' ?: false ?: null

    // 运算符重载
    operator fun get(index: Int) : INPUT ? = objectArray[index].takeIf { isR }
}

// 2.给泛型传入null后，直接操作
// 泛型是很大的范围类型，可以接收很多类型，当然也可以接收null，但是接收null后，要处理好
fun <INPUT> inputObj(item: INPUT) {
    // println((item as String).length) // 在泛型中，不能这样做，这个是不标准的

    // 泛型是很大的范围类型，可以接收很多类型，当然也可以接收null，但是接收null后，要处理好，
    // String? 能够接收 "Derry" "Kevins" 还可以接收null，所以 Stirng? 比 String 功能强大
    // 小结：异步处理泛型接收，都用 String? 处理  规范化
    println((item as String?)?.length ?: "你个货传递的泛型数据是null啊")
}

// TODO 108-Kotlin语言的[ ]操作符学习
// 1.5种返回类型变化的解释
// 2.给泛型传入null后，直接操作
fun main() {
    inputObj("Derry")
    inputObj("Kevins")
    inputObj(null)

    println()

    // 只要有一个元素是null，那么所有的元素都是 String?
    val p1 : KtBase108<String?> = KtBase108("张三", "李四", "王五", null)

    var r : String? = p1[0]
    val r2 : String ? = p1[3]

    println(r)
    println(p1[1])
    println(p1[2])
    println(r2)
}