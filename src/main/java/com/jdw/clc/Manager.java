package com.jdw.clc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jdwilson on 8/21/15.
 */
public class Manager extends Employee implements ManagerFunctions {

    // todo: ArrayList or Set/LinkedHashSet?  No dupes.
    private List<Employee> subordinates = new ArrayList<Employee>();

    Manager(Department department, double expenseAllocation) {
        super(EmployeeRole.MANAGER, department, expenseAllocation);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public double getTotalExpenseAllocation() {
        // todo:
        return 0;
    }

}
