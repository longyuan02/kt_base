package com.derry.s1

// TODO 18.Kotlin语言的具名函数参数
fun main() {
//    loginAction(age = 99, userpwd = "123", usernam = "de", username = "Derry", phonenumber = "123456")
//    loginAction(phonenumber ="", usernam = "", userpwd = "", username = "", age = 10)
    myFun2(10, 100f, 99f, 90f, 99f, name = "Jerry") // My name is Jerry, 10 years old, and my scores are 100.0 99.0 90.0 99.0
    socorFun( ageIndex =10, sor = *floatArrayOf(100f), name = "test");
}

private fun loginAction(username: String, userpwd: String, phonenumber: String, age: Int, usernam: String) {
    println("username:$username, userpwd:$userpwd, phonenumber:$phonenumber, age:$age")
}

//变长函数
fun myFun2(age: Int, vararg score: Float, name: String) {
    var scoreString = score.joinToString(" ")
    println("My name is $name, $age years old, and my scores are $scoreString")
    //or 也可以这样写
    val scoreArray = floatArrayOf(100f, 99f, 90f, 99f)
    myFun2(10, *scoreArray, name = "Jerry")
}
//具名函数内包含vararg可变长参数 使用arryOf()\doubleArrayOf()\floatArrayOf
fun socorFun(ageIndex:Int, vararg sor: Float, name: String){
        var soreString = sor.joinToString("")
    println("function:$soreString")
}

fun foo(vararg strings: String) { /*……*/ }


