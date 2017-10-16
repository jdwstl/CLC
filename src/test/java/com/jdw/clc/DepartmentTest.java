package com.jdw.clc;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jdwilson on 8/20/15.
 */
public class DepartmentTest {

    Employee testEmployee;
    Department testDept;
    String testDeptName = "testDeptName";

    @Before
    public void setUp() {
        testDept = new Department(testDeptName);
        testEmployee = new Employee(Employee.EmployeeRole.DEVELOPER, testDept, 100.00);
    }

    @After
    public void tearDown() {
        // this may not be necessary with JUnit4
        testDept = null;
        testEmployee = null;
    }

    @Test
    public void testDefaultCtor() {
        assertNotNull(testDept);
        assertEquals(testDeptName, testDept.getName());
    }

    @Test
    public void testSetAndGetName() {
        String testName = "testSoftwareEngineering";
        testDept.setName(testName);
        assertEquals(testName, testDept.getName());
    }

    @Test
    public void testDisplayJavaClasspath() {
        // get java properties -- demo
        //System.out.println("java.class.path=" + System.getProperty("java.class.path"));
        String classpath = System.getProperty("java.class.path");
        System.out.println(classpath);

        String[] parts = classpath.split(":");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part).append('\n');
        }

        System.out.print("classpath-elements:\n" + sb.toString());
    }

//    @Deprecated
//    public void testAddAndRemoveEmployee() {
//        // todo: introduce factory method/abstract factory here...
//        // need to be able to create an Employee and have factory set Employees' attributes,
//        // e.g, initialExpenseAllocation
//        assertNotNull(testEmployee);
//        testDept.addEmployee(testEmployee);
//        boolean removed = testDept.removeEmployee(testEmployee);
//        assertTrue(removed);
//    }
}
