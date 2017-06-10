package com.easy.kotlin

/**
 * Created by jack on 2017/6/11.
 */

data class Person(val name: String, val age: Int)

infix fun Person.grow(years: Int): Person {
    return Person(name, age + years)
}
