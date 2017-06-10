package com.easy.kotlin

import java.util.*

/**
 * Created by jack on 2017/6/8.
 */

class VariableVSValue {
    fun declareVar() {
        var a = 1
        a = 2
        println(a)
        println(a::class)
        println(a::class.java)

        var x = 5 // 自动推断出 `Int` 类型
        x += 1

        println("x = $x")
    }

    fun declareVal() {
        val b = "a"
        //b  = "b" //编译器会报错： Val cannot be reassigned
        println(b)
        println(b::class)
        println(b::class.java)

        val c: Int = 1  // 立即赋值
        val d = 2   // 自动推断出 `Int` 类型
        val e: Int  // 如果没有初始值类型不能省略
        e = 3       // 明确赋值
        println("c = $c, d = $d, e = $e")
    }

    fun typeInference() {
        val str = "abc"
        println(str)
        println(str is String)
        println(str::class)
        println(str::class.java)

//        abc
//        true
//        class java.lang.String (Kotlin reflection is not available)
//        class java.lang.String

        val d = Date()
        println(d)
        println(d is Date)
        println(d::class)
        println(d::class.java)

//        Fri Jun 09 00:06:33 CST 2017
//        true
//        class java.util.Date (Kotlin reflection is not available)
//        class java.util.Date

        val bool = true
        println(bool)
        println(bool::class)
        println(bool::class.java)

//        true
//        boolean (Kotlin reflection is not available)
//        boolean

        val array = arrayOf(1, 2, 3)
        println(array)
        println(array is Array)
        println(array::class)
        println(array::class.java)

//        [Ljava.lang.Integer;@7b5eadd8
//        true
//        class [Ljava.lang.Integer; (Kotlin reflection is not available)
//        class [Ljava.lang.Integer;
    }


    fun Int2Long() {
        val x: Int = 10
//        val y:Long = x // Type mismatch
        val y: Long = x.toLong()
    }


    fun getLength(obj: Any): Int? {
        var result = 0
        if (obj is String) {
            // `obj` 在该条件分支内自动转换成 `String`
            println(obj::class) //class java.lang.String
            result = obj.length
            println(result)
        }
        // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
        println(obj::class) // class java.lang.Object
        return result
    }
}
