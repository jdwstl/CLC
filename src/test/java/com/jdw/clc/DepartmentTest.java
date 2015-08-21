package com.jdw.clc;

import com.sun.tools.javac.tree.DCTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jdw.clc.Department;

import static org.junit.Assert.*;

/**
 * Created by jdwilson on 8/20/15.
 */
public class DepartmentTest {

    String testDeptName = "testDeptName";
    Department testDept;

    @Before
    public void setUp() {
        testDept = new Department(testDeptName);
    }

    @After
    public void tearDown() {
        // this may not be necessary with JUnit4
        testDept = null;
    }

    // todo: These two could be refactored into one test, with multiple asserts.
    @Test
    public void testGetName() {
        String actualName = testDept.getName();
        assertEquals(testDeptName, actualName);
    }

    @Test
    public void testSetName() {
        String testName = "testSoftwareEngineering";
        testDept.setName(testName);
        assertEquals(testName, testDept.getName());
    }
}

// reference:
//    @Test(expected=IndexOutOfBoundsException.class)
//    public void testIndexOutOfBoundsException() {
//        ArrayList emptyList = new ArrayList();
//        Object o = emptyList.get(0);
//    }