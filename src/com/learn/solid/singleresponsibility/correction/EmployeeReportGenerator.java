package com.learn.solid.singleresponsibility.correction;

public class EmployeeReportGenerator {

    private PDFReportFormatter pdfReportFormatter;

    private CSVReportFormatter csvReportFormatter;

    public EmployeeReportGenerator() {
        this.pdfReportFormatter = new PDFReportFormatter();
        this.csvReportFormatter = new CSVReportFormatter();
    }

    public void generatePDFReport(Employee employee){
        pdfReportFormatter.generateReport(employee);
    }

    public void generateCSVReport(Employee employee){
        csvReportFormatter.generateReport(employee);
    }
}
