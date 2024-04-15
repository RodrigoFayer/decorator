package org.example;

public class MetaAds extends ReportDecorator{
    public MetaAds(Report report) {
        super(report);
    }

    @Override
    public String getData() {
        return "Meta Ads";
    }
}
