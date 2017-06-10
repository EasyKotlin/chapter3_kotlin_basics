package com.easy.kotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


/**
 * Created by jack on 2017/6/11.
 */

@RunWith(JUnit4::class)
class ExtensionsDemoTest {
    @Test fun testExtensionsDemo() {
        val demo = ExtensionsDemo()
        demo.useExtensions()

        val inner = ExtensionsDemo.Inner()
        inner.useExtensions()

        val mmmList = mutableListOf<Int>(100, 200, 300, 400, 500)
        mmmList.swap(0, 1)

    }

}
