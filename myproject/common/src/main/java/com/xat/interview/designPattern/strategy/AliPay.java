package com.xat.interview.designPattern.strategy;

/**
 * @author xuantao
 */
public class AliPay implements OnlinePay {

    @Override
    public void pay() {
        System.out.println("正在使用支付宝支付");
    }
}
