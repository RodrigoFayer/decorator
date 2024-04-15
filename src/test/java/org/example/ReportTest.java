package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportTest {
    @Test
    void shouldGenerateBasicReport() {
        Report report = new BasicReport();
        assertEquals("Basic Report", report.generate());
    }

    @Test
    void shouldGenerateBasicReportWithCustomData() {
        Report report = new BasicReport("Custom Data");
        assertEquals("Custom Data", report.generate());
    }

    @Test
    void shouldGenerateBasicReportWithInstagramDecorator() {
        Report report = new Instagram(new BasicReport());
        assertEquals("Basic Report / Instagram", report.generate());
    }

    @Test
    void shouldGenerateBasicReportWithMetaAdsDecorator() {
        Report report = new MetaAds(new BasicReport());
        assertEquals("Basic Report / Meta Ads", report.generate());
    }

    @Test
    void shouldGenerateBasicReportWithGoogleAdsDecorator() {
        Report report = new GoogleAds(new BasicReport());
        assertEquals("Basic Report / Google Ads", report.generate());
    }

    @Test
    void shouldGenerateBasicReportWithInstagramAndMetaAdsDecorator() {
        Report report = new MetaAds(new Instagram(new BasicReport()));
        assertEquals("Basic Report / Instagram / Meta Ads", report.generate());
    }

    @Test
    void shouldGenerateBasicReportWithInstagramAndGoogleAdsDecorator() {
        Report report = new GoogleAds(new Instagram(new BasicReport()));
        assertEquals("Basic Report / Instagram / Google Ads", report.generate());
    }

    @Test
    void shouldGenerateBasicReportWithMetaAdsAndGoogleAdsDecorator() {
        Report report = new GoogleAds(new MetaAds(new BasicReport()));
        assertEquals("Basic Report / Meta Ads / Google Ads", report.generate());
    }

    @Test
    void shouldGenerateBasicReportWithInstagramAndMetaAdsAndGoogleAdsDecorator() {
        Report report = new GoogleAds(new MetaAds(new Instagram(new BasicReport())));
        assertEquals("Basic Report / Instagram / Meta Ads / Google Ads", report.generate());
    }
}
