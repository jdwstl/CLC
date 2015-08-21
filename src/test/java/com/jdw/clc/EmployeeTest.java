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

    @Before
    public void setUp() {
        employee = new Employee(testRole);
    }

    @Test
    public void testCreateEmployee() {
        Employee employee = new Employee(Employee.EmployeeRole.DEVELOPER);
        assertNotNull("employee is null", employee);
        Employee.EmployeeRole role = employee.getRole();
        assertEquals(Employee.EmployeeRole.DEVELOPER, role);
    }

    @Test
    public void testGetEmployeeRole() {
        Employee.EmployeeRole role = employee.getRole();
        assertEquals(testRole, role);       // actual test
        System.err.println("testRole= " + testRole.toString());     // testing enum toString(), should print DEVELOPER
    }
}