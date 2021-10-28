package com.learn.solid.singleresponsibility.correction;

public class EmployeeManagementService {

    private EmployeeDao employeeDao;

    private EmployeeReportGenerator employeeReportGenerator;

    public EmployeeManagementService() {
        this.employeeDao = new EmployeeDao();
        this.employeeReportGenerator = new EmployeeReportGenerator();
    }

    public void registerEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    public void terminateEmployee(Employee employee) {
        employeeDao.deleteEmployee(employee);
    }

    public void getEmployeeDetailsInPdf(Employee employee){
        employeeReportGenerator.generatePDFReport(employee);
    }

    public void getEmployeeDetailsInCsv(Employee employee){
        employeeReportGenerator.generateCSVReport(employee);
    }
}
