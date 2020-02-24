package com.factory.demo;

public class WechatFactory extends PayFactory {
    protected IPay createPay() {
        return new WechatPay();
    }
}
