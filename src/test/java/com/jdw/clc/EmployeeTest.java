package com.jdw.clc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jdwilson on 8/20/15.
 */
public class EmployeeTest {

    Employee employee;
    Employee.EmployeeRole testRole = Employee.EmployeeRole.DEVELOPER;
    Department testDept = new Department("SoftwareEngineering");

    @Before
    public void setUp() {
        employee = new Employee(testRole, testDept);
    }

    @Test
    public void testCreateEmployee() {
        // local instance
        Employee employee = new Employee(testRole, testDept);
        assertNotNull("employee is null", employee);
        Employee.EmployeeRole role = employee.getRole();
        assertEquals(testRole, role);
        assertEquals(testDept, employee.getDepartment());
    }

    @Test
    public void testCreateEmployeeWithExpenseAllocation() {
        // local instance
        Employee employee = new Employee(testRole, testDept, 1500.00);
        assertNotNull("employee is null", employee);
        Employee.EmployeeRole role = employee.getRole();
        assertEquals(testRole, role);
        assertEquals(testDept, employee.getDepartment());
        double expAlloc = employee.getExpenseAllocation();
        assertEquals(1500.00, expAlloc, 0.005);
    }

    @Test
    public void testGetEmployeeRole() {
        Employee.EmployeeRole role = employee.getRole();
        assertEquals(testRole, role);
        System.err.println("testRole= " + testRole.toString());     // testing enum toString(), should print DEVELOPER
    }

    @Test
    public void testSetAndGetEmployeeRole() {
        // resets test case employee object
        employee.setRole(Employee.EmployeeRole.MANAGER);
        Employee.EmployeeRole role = employee.getRole();
        assertEquals(Employee.EmployeeRole.MANAGER, role);
    }

    @Test
    public void testDefaultExpenseAllocation() {
        double expAlloc = employee.getExpenseAllocation();
        assertEquals(0.00, expAlloc, 0.005); // experimenting with this right now, 3rd param is epsilon
    }

    @Test
    public void testSetAndGetDepartment() {
        // set something different than what is in the setUp config.
        employee.setDepartment(new Department("QADept"));
        Department dept = employee.getDepartment();
        assertEquals("QADept", dept.getName());
    }

    @Test
    public void testSetAndGetExpenseAllocation() {
        employee.setExpenseAllocation(1500.000);
        double expAlloc = employee.getExpenseAllocation();
        assertEquals(1500.00, expAlloc, 0.005);
        System.err.println("expAlloc= " + expAlloc);  // testing output for rounding, display
    }
}