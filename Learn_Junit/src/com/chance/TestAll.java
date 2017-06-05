package com.chance;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * Created by Chance on 16/11/02.
 *
 * http://lavasoft.blog.51cto.com/62575/65625/
 */
public class TestAll extends TestSuite {
    public static Test suite() {
        TestSuite suite = new TestSuite("TestSuite Test");
        suite.addTestSuite(TestCalcuator.class);
        suite.addTestSuite(TestCalcuator2.class);
        return suite;
    }
    public static void main(String args[]){
        TestRunner.run(suite());
    }
}
