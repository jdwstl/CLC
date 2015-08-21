package com.jdw.clc;

/**
 * Created by jdwilson on 8/20/15.
 * Responsible for creating instances of Employees
 */

public class EmployeeFactory {

    Employee employee = new Employee(Employee.EmployeeRole.UNASSIGNED);

//    private EmployeeFactory() {
//        // tbd
//    }
//
//    public static EmployeeFactory getInstance() {
//        return new EmployeeFactory();
//    }

    public static Employee createEmployee(Employee.EmployeeRole role) {
        return Employee(role);
    }
}
