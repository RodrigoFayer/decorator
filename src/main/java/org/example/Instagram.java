package org.example;

public class Instagram extends ReportDecorator {
    public Instagram(Report report) {
        super(report);
    }

    @Override
    public String getData() {
        return "Instagram";
    }
}
