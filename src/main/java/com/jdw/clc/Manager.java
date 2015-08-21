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

    public boolean addEmployee(Employee emp) {
        return subordinates.add(emp);
    }

    public boolean removeEmployee(Employee emp) {
        return subordinates.remove(emp);
    }

    // tbd
    public List<Employee> getSubordinates() {
         return subordinates;
    }

    // by manager
    public double getTotalExpenseAllocation() {
        double totalExpenseAllocation = 0.0;
        for (Employee emp : subordinates) {
            totalExpenseAllocation += emp.getExpenseAllocation();
        }
        // include this managers allocation in total
        totalExpenseAllocation += this.getExpenseAllocation();
        return totalExpenseAllocation;
    }

    // by department
    public double getTotalExpenseAllocation(Department dept) {
        double totalExpenseAllocation = 0.0;
        for (Employee emp : subordinates) {
            if (emp.getDepartment().equals(dept)) {
                totalExpenseAllocation += emp.getExpenseAllocation();
            }
        }
        // include this managers allocation in total
        totalExpenseAllocation += this.getExpenseAllocation();
        return totalExpenseAllocation;
    }

}
// NOTES:
// this could be done by implementing MangagerFuctions, or going through Manager and
// iterate through all subordinates.
// refactoring... tbd
//    // todo: find appropriate floating point type for currency, java currency.
//    public double getExpenseAllocation() {
//        // todo for each manager get expense allocation
//        // non-manager employees can be ignored because their manager method
//        // can roll-up the subordinate expense allocation.
//        return 0.0; // fixme
//    }