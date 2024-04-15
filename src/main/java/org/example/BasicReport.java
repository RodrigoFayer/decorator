package org.example;

public class BasicReport implements Report {
    private String data;

    public BasicReport() {
        this.data = "Basic Report";
    }

    public BasicReport(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String generate() {
        return data;
    }
}
