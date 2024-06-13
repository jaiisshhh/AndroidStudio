package com.example.helloworld;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
    Calculator calculator;

    //OnCreate


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    public void TestAdd(){
        int expected = 40;
        int actual = calculator.add(10,20);
        assertEquals(expected,actual);
    }
    public void TestMultiply() {
        int expected = 20;
        int actual = calculator.multiply(5,4);
        assertEquals(expected,actual);
    }

    //OnDestroy


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}



