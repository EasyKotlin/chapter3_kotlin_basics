package com.easy.kotlin

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by jack on 2017/6/8.
 */
@RunWith(JUnit4::class)
class VariableVSValueTest {
    val variableVSValue = VariableVSValue()

    @Test
    fun testDeclareVar() {
        variableVSValue.declareVar()
    }

    @Test
    fun testDeclareVal() {
        variableVSValue.declareVal()
    }

    @Test
    fun testTypeInference() {
        variableVSValue.typeInference()
    }

    @Test
    fun testGetLength() {
        val obj = "abcdef"
        val len = variableVSValue.getLength(obj)
        Assert.assertTrue(len == 6)

        val obj2:Any = Any()
        variableVSValue.getLength(obj2)

    }

}
