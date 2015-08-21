package com.jdw.clc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jdwilson on 8/20/15.
 */
public class EmployeeTest {

    // declaration only
    Employee employee;

//    @Before
//    public void setUp() {
//        employee = new Employee(Employee.EmployeeRole.DEVELOPER);
//    }

    @Test
    public void testCreateEmployee() {
        employee = new Employee(Employee.EmployeeRole.DEVELOPER);
        assertNotNull("employee is null", employee);
        Employee.EmployeeRole role = employee.getRole();
        assertEquals(Employee.EmployeeRole.DEVELOPER,role);
    }
}