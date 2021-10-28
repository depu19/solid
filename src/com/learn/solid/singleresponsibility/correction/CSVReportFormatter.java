package com.learn.solid.singleresponsibility.correction;

public class CSVReportFormatter implements ReportFormatter{

    @Override
    public void generateReport(Object data) {
        System.out.println("generate the csv string of the report"+ data);

    }
}
