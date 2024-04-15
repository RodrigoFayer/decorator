package org.example;

public class GoogleAds extends ReportDecorator{
    public GoogleAds(Report report) {
        super(report);
    }

    @Override
    public String getData() {
        return "Google Ads";
    }
}
