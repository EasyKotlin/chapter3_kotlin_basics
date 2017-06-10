package com.easy.kotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by jack on 2017/6/10.
 */
@RunWith(JUnit4::class)
class KeyWordDemoTest {

    @Test
    fun testThisKeyWord() {
        val outer = Outer()
        outer.Inner().m()
    }

    @Test
    fun testThisDemo(){
        val demo = ThisDemo()
        println(demo.whatIsThis())
    }

    @Test
    fun testSuperKeyWord() {
        val son = Son("Harry")
        son.love()
    }
}
