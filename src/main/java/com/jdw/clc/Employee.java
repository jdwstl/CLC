package com.jdw.clc;

import com.jdw.clc.Department;

/**
 * Created by jdwilson on 8/20/15.
 */
public class Employee {

    public enum EmployeeRole {
        // enums are implicitly public static final
        // @ref: http://www.javapractices.com/topic/TopicAction.do?Id=1
        UNASSIGNED,
        MANAGER,
        DEVELOPER,
        QA_TESTER
    }

    private EmployeeRole role;
    private Department department;

    // todo: review, consider using BigDecimal or java.util.Currency
    // or we could use int here and just assume whole dollar amounts for this case.
    private double expenseAllocation = 0.00;

    protected Employee(EmployeeRole role) {
        // todo: review
        // Does not make sense to instantiate an employee without a dept or initial expense allocation.
        // Does it make sense to create an empty Employee with an UNASSIGNED role?
        this.role = role;
        this.department = new Department("unassigned");
        // this.expenseAllocation set by declaration
    }

    public Employee(EmployeeRole role, Department department) {
        this.role = role;
        this.department = department;
    }

    public Employee(EmployeeRole role, Department department, double expenseAllocation) {
        this.role = role;
        this.department = department;
        this.expenseAllocation = expenseAllocation;
    }

    public Employee.EmployeeRole getRole() {
        return this.role;
    }

    public void setRole(Employee.EmployeeRole role) {
        this.role = role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getExpenseAllocation() {
        return this.expenseAllocation;
    }

    public void setExpenseAllocation(double expenseAllocation) {
        this.expenseAllocation = expenseAllocation;
    }
}
