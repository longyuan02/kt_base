package com.derry.s4

// TODO 66.Kotlin语言的Map的创建
fun main() {
    val mMap1 : Map<String, Double> = mapOf<String, Double>("Derry" to(534.4), "Kevin" to 454.5)
    val mMap2 = mapOf(Pair("Derry", 545.4), Pair("Kevin", 664.4))
    // 上面两种方式是等价的哦
}