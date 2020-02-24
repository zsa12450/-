package com.factory.demo;

public class UnionFactory extends PayFactory {
    protected IPay createPay() {
        return new UnionPay();
    }
}
