package com.factory.demo;

public class CrossBorderFactory extends PayFactory {
    protected IPay createPay() {
        return new CrossBorderPay();
    }
}
