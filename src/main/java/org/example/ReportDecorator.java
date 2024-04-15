package org.example;

public abstract class ReportDecorator implements Report {
    private Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public abstract String getData();

    public String generate() {
        return this.report.generate() + " / " + getData();
    }
}
