package com.easy.kotlin

/**
 * Created by jack on 2017/6/9.
 */

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun getMax(a: Int, b: Int): Int {
    if (a > b) return a else return b
}

fun sum2(a: Int, b: Int) = a + b
fun getMax2(a: Int, b: Int) = if (a > b) a else b

fun returnDemo_1() {
    println(" START " + ::returnDemo_1.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach {
        if (it == 3) return
        println(it)
    }
    println(" END " + ::returnDemo_2.name)
}

//1
//2

fun returnDemo_2() {
    println(" START " + ::returnDemo_2.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach(fun(a: Int) {
        if (a == 3) return
        println(a)
    })
    println(" END " + ::returnDemo_2.name)
}

//1
//2
//4
//5

fun returnDemo_3() {
    println(" START " + ::returnDemo_3.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
//    在 Kotlin 中任何表达式都可以用标签（label）来标记。 标签的格式为标识符后跟 @ 符号，例如：abc@、fooBar@都是有效的标签
    intArray.forEach here@ {
        if (it == 3) {
            return@here // 从 lambda 表达式 here@ 中返回。
        }
        println(it)
    }
    println(" END " + ::returnDemo_3.name)
}

//1
//2
//4
//5

fun returnDemo_4() {
    println(" START " + ::returnDemo_4.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach {
        if (it == 3) {
            return@forEach // 从 lambda 表达式 @forEach 中返回。
        }
        println(it)
    }

    println(" END " + ::returnDemo_4.name)
}

//1
//2
//4
//5


fun returnDemo_5() {

    println("-----------returnDemo_5----------")
    outerfun@ fun outer() {
        println("START OUTER")

        innerfun@ fun inner() {
            println("INNER")
            for (i in 1..10) {
                println(i)
                if (i % 2 == 0) {
                    return@innerfun
                }
            }
        }

        inner() // invoke fun inner()
        println("END OUTER")
        return@outerfun
    }

    outer() // invoke fun outer()
}


fun returnDemo_6() {

    println("-----------returnDemo_6----------")
    fun outer() {
        println("START OUTER")

        fun inner() {
            println("INNER")
            for (i in 1..10) {
                println(i)
                if (i % 2 == 0) {
                    return
                }
            }
        }

        inner() // invoke fun inner()
        println("END OUTER")
        return
    }

    outer() // invoke fun outer()
}

//-----------returnDemo_6----------
//START OUTER
//INNER
//1
//2
//END OUTER




fun breakDemo_1() {
    println("---------------  breakDemo_1 ---------------")
    for (outer in 1..5) {
        println("outer=" + outer)
        for (inner in 1..10) {
            println("inner=" + inner)
            if (inner % 2 == 0) {
                break
            }
        }
    }
}

fun breakDemo_2() {
    println("---------------  breakDemo_2 ---------------")
    outer@ for (outer in 1..5)
        for (inner in 1..10) {
            println("inner=" + inner)
            println("outer=" + outer)
            if (inner % 2 == 0) {
                break@outer
            }
        }
}


fun breakDemo_3() {
    println("---------------  breakDemo_3 ---------------")
    for (outer in 1..5)
        inner@ for (inner in 1..10) {
            println("inner=" + inner)
            println("outer=" + outer)
            if (inner % 2 == 0) {
                break@inner
            }
        }
}



fun continueDemo() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}

