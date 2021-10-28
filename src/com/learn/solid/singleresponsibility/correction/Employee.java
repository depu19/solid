package com.learn.solid.singleresponsibility.correction;

public class Employee {

    private String name;

    private String Id;

    private String department;

    public Employee(String name, String id, String department) {
        this.name = name;
        Id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
