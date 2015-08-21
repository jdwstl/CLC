package com.jdw.clc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jdwilson on 8/21/15.
 */
public class Manager extends Employee implements ManagerFunctions {

    private List<Employee> subordinates = new ArrayList<Employee>();

    Manager() {
        super(EmployeeRole.MANAGER);
    }

    Manager(double expenseAllocation) {
        super(EmployeeRole.MANAGER, expenseAllocation);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }
}
