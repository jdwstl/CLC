package com.jdw.clc;

import java.util.List;

/**
 * Created by jdwilson on 8/21/15.
 */
public interface ManagerFunctions {
    /**
     * @return list of subordinate employees to iterate over.
     */
    public List<Employee> getSubordinates();

    /**
     *
     * @return Total expense allocation for this class.
     */
    public double getTotalExpenseAllocation();
}
