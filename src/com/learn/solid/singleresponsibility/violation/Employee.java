package com.learn.solid.singleresponsibility.violation;

/**
 * according to single responsibility principle, a class should only have a single reason to change,
 * If the class is doing too many actions then its a violation of single responsibility principle.
 * This principle goes in parallel with the DRY(don't repeat yourself) principle.
 * If a class adheres to single responsibility, then it will always adhere to DRY
 */
public class Employee {

    private String name;

    private String Id;

    private String department;


    //this is not a behaviour/responsibility of employee class
    public void registerEmployee(Employee employee){

    }
    //this is not a behaviour/responsibility of employee class
    public void terminateEmployee(Employee employee){

    }
    //this is not a behaviour/responsibility of employee class
    public void exportEmployeeDetailsInCSV(Employee employee){

    }
    //this is not a behaviour/responsibility of employee class
    public void exportEmployeeDetailsInPDF(Employee employee){

    }
}
