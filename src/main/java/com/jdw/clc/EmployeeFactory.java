package com.jdw.clc;

/**
 * Created by jdwilson on 8/20/15.
 * Responsible for creating instances of Employees
 * Manager is a concrete class as it has additional methods.
 */

public class EmployeeFactory {

    private static final double initialManagerExpenseAllocation = 300.00;
    private static final double initialDeveloperExpenseAllocation = 1000.00;
    private static final double initialQATesterExpenseAllocation = 500.00;

    public static Employee createEmployee(Employee.EmployeeRole role) throws EmployeeFactoryException {

        if (role.equals(Employee.EmployeeRole.MANAGER)) {
            return new Manager(initialManagerExpenseAllocation);
        } else if (role.equals(Employee.EmployeeRole.DEVELOPER)) {
            return new Employee(Employee.EmployeeRole.DEVELOPER, initialDeveloperExpenseAllocation);
        } else if (role.equals(Employee.EmployeeRole.QA_TESTER)) {
            return new Employee(Employee.EmployeeRole.QA_TESTER, initialQATesterExpenseAllocation);
        } else {
            throw new EmployeeFactoryException("Invalid Employee Role");
        }
    }
}
