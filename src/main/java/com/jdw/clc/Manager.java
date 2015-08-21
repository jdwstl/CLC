package com.jdw.clc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jdwilson on 8/21/15.
 */
public class Manager extends Employee implements ManagerFunctions {

    private List<Employee> subordinates = new ArrayList<Employee>();

//    Manager() {
//        super(Employee.EmployeeRole.MANAGER);
//    }

    Manager(Department department, double expenseAllocation) {
        super(EmployeeRole.MANAGER, department, expenseAllocation);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }
}
