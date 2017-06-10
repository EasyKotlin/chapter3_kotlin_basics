package com.easy.kotlin

/**
 * Created by jack on 2017/6/9.
 */


fun main(args: Array<String>) {
    val rawString = """
fun helloWorld(val name : String) {
   println("Hello, world!")
}
"""
    println(rawString)

    val fooTemplateString = "$rawString has ${rawString.length} characters"
    println(fooTemplateString)

}
