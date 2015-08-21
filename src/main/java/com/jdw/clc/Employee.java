package com.jdw.clc;


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
    // todo: review, consider using BigDecimal or java.util.Currency
    // or we could use int here and just assume whole dollar amounts for this case.
    private double expenseAllocation = 0.00;

    private Employee() {
        // todo: review
        // Does not make sense to instantiate an employee without a role.
        // Does not make sense to create an empty Employee either with UNASSIGNED role?
        role = EmployeeRole.UNASSIGNED;
    }
    
    public Employee(EmployeeRole role) {
        this.role = role;
    }

    public Employee.EmployeeRole getRole() {
        return this.role;
    }

    public void setRole(Employee.EmployeeRole role) {
        this.role = role;
    }

    public double getExpenseAllocation() {
        return this.expenseAllocation;
    }

    public void setExpenseAllocation(double expenseAllocation) {
        this.expenseAllocation = expenseAllocation;
    }
}
