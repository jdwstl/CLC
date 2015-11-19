package com.jdw.clc;

import java.util.List;

/**
 * Created by jdwilson on 8/21/15.
 */
public interface ManagerFunctions {

    boolean addEmployee(Employee employee);

    boolean removeEmployee(Employee emp);

    double getTotalExpenseAllocation();

    // this is not ideal... should be refactored into Department class
    // refactoring EmployeeFactory too.
    // Violates? single responsibiltiy prin.
    double getTotalExpenseAllocation(Department dept);

}
