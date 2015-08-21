package com.jdw.clc;

import com.jdw.clc.Employee;
import com.jdw.clc.Employee.EmployeeRole;

/**
 * Created by jdwilson on 8/20/15.
 * Responsible for creating instances of Employees
 * Manager is a concrete class as it has additional methods.
 */

public class EmployeeFactory {

    private static final double initialDeveloperExpenseAllocation = 1000.00;
    private static final double initialQATesterExpenseAllocation = 500.00;
    private static final double initialManagerExpenseAllocation = 300.00;

    // tood add Department
    public static Employee createEmployee(Employee.EmployeeRole role,
                                          Department department) throws EmployeeFactoryException {

        // expenseAllocation is defined by role
        if (role.equals(Employee.EmployeeRole.MANAGER)) {
            return new Manager(department, initialManagerExpenseAllocation);
        } else if (role.equals(Employee.EmployeeRole.DEVELOPER)) {
            return new Employee(Employee.EmployeeRole.DEVELOPER, department, initialDeveloperExpenseAllocation);
        } else if (role.equals(Employee.EmployeeRole.QA_TESTER)) {
            return new Employee(Employee.EmployeeRole.QA_TESTER, department, initialQATesterExpenseAllocation);
        } else {
            throw new EmployeeFactoryException("Invalid Employee Role");
        }
    }
}
