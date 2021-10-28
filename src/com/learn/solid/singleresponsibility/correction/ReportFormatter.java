package com.learn.solid.singleresponsibility.correction;

public interface ReportFormatter <T>{

    void generateReport(T data);
}
