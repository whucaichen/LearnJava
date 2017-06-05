package com.chance;

import junit.framework.TestCase;

/**
 * Created by Chance on 16/11/02.
 */
public class TestCalcuator extends TestCase {
    public void testAdd(){
        Calculator calculator =new Calculator();
        double result= calculator.add(1,2);
        assertEquals(3,result,0);
    }

}