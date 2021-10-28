package com.learn.solid.singleresponsibility.correction;

public class EmployeeDao {

    public void saveEmployee(Employee employee) {
        System.out.println("Save employee to DB");
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Delete employee from DB");
    }
}
