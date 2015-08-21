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

//    @Ignore tbd
//    public void testDefaultCtor() {
//        Department testDefault = new Department();
//        String testName = testDefault.getName();
//        assertEquals("unassigned", testName);       // code smell, uses knowledge of internal implemenatation.
//    }

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
    public void testAddAndRemoveEmployee() {
        // todo: introduce factory method/abstract factory here...
        // need to be able to create an Employee and have factory set Employees' attributes,
        // e.g, initialExpenseAllocation
        Employee emp = new Employee(Employee.EmployeeRole.DEVELOPER);
        assertNotNull(emp);
        testDept.addEmployee(emp);
        boolean removed = testDept.removeEmployee(emp);
        assertTrue(removed);
    }
}
