package com.jdw.clc;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by jdwilson on 8/20/15.
 */
public class Department {

    private String name;
    private Set<Employee> employees;

    // todo: Does not make sense to create an unnamed department.
    private Department() {
        this.name = "unassigned";
    }

    public Department(String name) {
        this.name = name;
        employees = new LinkedHashSet<Employee>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(Employee emp) {
        return employees.remove(emp);
    }

    // todo: find appropriate floating point type for currency, java currency.
    public double getExpenseAllocation() {
        // todo for each manager get expense allocation
        // non-manager employees can be ignored because their manager method
        // can roll-up the subordinate expense allocation.
        return 0.0; // fixme
    }
}
