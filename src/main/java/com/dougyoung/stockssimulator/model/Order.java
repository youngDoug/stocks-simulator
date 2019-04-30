package com.dougyoung.stockssimulator.model;

public class Order {
    private Stock security;
    private Side side;
    private double value;

    public Order(Stock security, Side side, double value) {
        this.security = security;
        this.side = side;
        this.value = value;
    }

    public Stock getSecurity() {
        return security;
    }

    public void setSecurity(Stock security) {
        this.security = security;
    }
}
