package com.dougyoung.stockssimulator.model;

/**
 * In my ignorance, this will be my stock model.
 * https://www.investopedia.com/markets/stocks/amd/
 */

public class Stock {
    private String acronym;
    private String fullName;
    private double volume;
    private float previousClose;
    private float open;
    private float dayRangeLow, dayRangeHigh;
    private float yearRangeLow, yearRangeHigh;
    private float priceEarningsRatio;
    private float beta;
    private float marketCap;
    private float EPS;

    public Stock() {
        this.acronym = "TEST";
        this.fullName = "TEST STOCK PLEASE IGNORE";
        this.volume = 0.00;
        this.previousClose = 0.0f;
        this.open = 0.0f;
        this.dayRangeLow =  0.0f;
        this.dayRangeHigh =  0.0f;
        this.yearRangeLow =  0.0f;
        this.yearRangeHigh =  0.0f;
        this.priceEarningsRatio =  0.0f;
        this.beta =  0.0f;
        this.marketCap =  0.0f;
        this.EPS =  0.0f;
    }

    public Stock(String acronym, String fullName, double volume, float previousClose, float open, float dayRangeLow, float dayRangeHigh, float yearRangeLow, float yearRangeHigh, float priceEarningsRatio, float beta, float marketCap, float EPS) {
        this();
        this.acronym = acronym;
        this.fullName = fullName;
        this.volume = volume;
        this.previousClose = previousClose;
        this.open = open;
        this.dayRangeLow = dayRangeLow;
        this.dayRangeHigh = dayRangeHigh;
        this.yearRangeLow = yearRangeLow;
        this.yearRangeHigh = yearRangeHigh;
        this.priceEarningsRatio = priceEarningsRatio;
        this.beta = beta;
        this.marketCap = marketCap;
        this.EPS = EPS;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public float getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(float previousClose) {
        this.previousClose = previousClose;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getDayRangeLow() {
        return dayRangeLow;
    }

    public void setDayRangeLow(float dayRangeLow) {
        this.dayRangeLow = dayRangeLow;
    }

    public float getDayRangeHigh() {
        return dayRangeHigh;
    }

    public void setDayRangeHigh(float dayRangeHigh) {
        this.dayRangeHigh = dayRangeHigh;
    }

    public float getYearRangeLow() {
        return yearRangeLow;
    }

    public void setYearRangeLow(float yearRangeLow) {
        this.yearRangeLow = yearRangeLow;
    }

    public float getYearRangeHigh() {
        return yearRangeHigh;
    }

    public void setYearRangeHigh(float yearRangeHigh) {
        this.yearRangeHigh = yearRangeHigh;
    }

    public float getPriceEarningsRatio() {
        return priceEarningsRatio;
    }

    public void setPriceEarningsRatio(float priceEarningsRatio) {
        this.priceEarningsRatio = priceEarningsRatio;
    }

    public float getBeta() {
        return beta;
    }

    public void setBeta(float beta) {
        this.beta = beta;
    }

    public float getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(float marketCap) {
        this.marketCap = marketCap;
    }

    public float getEPS() {
        return EPS;
    }

    public void setEPS(float EPS) {
        this.EPS = EPS;
    }
}
