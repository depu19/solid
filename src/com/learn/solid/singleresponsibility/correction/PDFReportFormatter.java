package com.learn.solid.singleresponsibility.correction;

public class PDFReportFormatter implements ReportFormatter{

    @Override
    public void generateReport(Object data) {
        System.out.println("generate the pdf string of the report "+ data);
    }
}
