package com.derry

class Test {


}
fun main(){
    range()
}

/**
 *  in 使用再范围内
 */
private fun range(){
    val x:Int = 20
    val y:Int = 10
    if(x in 1..y+1){
        println("range")
    }else{
        println("no range")
    }
}