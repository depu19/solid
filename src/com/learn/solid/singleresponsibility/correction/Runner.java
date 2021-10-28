package com.learn.solid.singleresponsibility.correction;

public class Runner {

    public static void main(String[] args) {
        Employee employee = new Employee("Deepa","43233","MOE");
        EmployeeManagementService service = new EmployeeManagementService();
        service.registerEmployee(employee);
        service.getEmployeeDetailsInPdf(employee);
        service.getEmployeeDetailsInCsv(employee);
        service.terminateEmployee(employee);
    }
}
