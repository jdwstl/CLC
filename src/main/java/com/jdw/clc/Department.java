package com.jdw.clc;

/**
 * Created by jdwilson on 8/20/15.
 */
public class Department {

    private String name;

    private Department() {
        // leaving this private for now, as if we create a department
        // it should at least have a name.
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
