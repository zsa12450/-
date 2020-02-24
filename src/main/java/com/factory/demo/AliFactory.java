package com.factory.demo;

public class AliFactory extends PayFactory {

    protected IPay createPay() {
        return new AliPay();
    }
}
