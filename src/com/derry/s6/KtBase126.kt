package com.derry.s6

// TODO 126-Kotlin语言的过滤函数-filter
fun main() {
    // println("126-Kotlin语言的过滤函数-filter")

    val nameLists = listOf(
        listOf("黄晓明", "李连杰", "李小龙"),
        listOf("刘军", "李元霸", "刘明"),
        listOf("刘俊", "黄家驹", "黄飞鸿")
    )

    nameLists.map {
        // it ==  nameLists的元素 == listOf("黄晓明", "李连杰", "李小龙"),
        println(it)
    }

    println()

    nameLists.flatMap {
        // it ==  nameLists的元素 == listOf("黄晓明", "李连杰", "李小龙"),
        println(it)

        listOf("")
    }

    println()

    nameLists.flatMap {

        // 进来了 3次
        it -> it.filter {
            println("$it filter") // 进来了 9次
            true
            // false

            // 原理：filter {true,false}  true他会加入到新的集合 进行组装新集合 返回，  否则false，过滤掉，不加入，返回空集合
        }
    }.map {
        print("$it   ")
    }

    println()
    println()

    nameLists.map {
        it -> it.filter {
            true
        }
    }.map {
        print("$it   ")
    }

    println()
    println()

    nameLists.flatMap {
        it -> it.filter {
            true
        }
    }.map {
        print("$it   ")
    }

    println()
    println()

    // List<T> 返回给 map 后的效果： [黄晓明, 李连杰, 李小龙]   [刘军, 李元霸, 刘明]   [刘俊, 黄家驹, 黄飞鸿]
    // List<T> 返回给 flatMap 效果: 黄晓明   李连杰   李小龙   刘军   李元霸   刘明   刘俊   黄家驹   黄飞鸿

    nameLists.flatMap {
            it -> it.filter {
                it.contains('黄') // 包含 ‘黄’ true，否则是false
            }
    }.map {
        print("$it   ")
    }

    println()
    println()

    nameLists.flatMap {
            it -> it.filter {
        it.contains('刘') // 包含 ‘刘’ true，否则是false
    }
    }.map {
        print("$it   ")
    }

    println()
    println()

    nameLists.flatMap {
            it -> it.filter {
        it.contains('李') // 包含 ‘李’ true，否则是false
    }
    }.map {
        print("$it   ")
    }
}