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

}
