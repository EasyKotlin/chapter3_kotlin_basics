package com.easy.kotlin

/**
 * Created by jack on 2017/6/9.
 */


fun main(args: Array<String>) {
    println(max(1, 2))
}

fun max(a: Int, b: Int): Int {

// 作为表达式
    val max = if (a > b) a else b
    return max //  return if (a > b) a else b
}

fun max1(a: Int, b: Int): Int {
    // 传统用法
    var max1 = a
    if (a < b) max1 = b
    return max1

}

fun max2(a: Int, b: Int): Int {

// With else
    var max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }
    return max2
}

fun max3(a: Int, b: Int): Int {
    val max = if (a > b) {
        print("Max is a")
        a
    } else {
        print("Max is b")
        b
    }
    return max
}


