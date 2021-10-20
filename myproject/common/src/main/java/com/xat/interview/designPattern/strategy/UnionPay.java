package com.xat.interview.designPattern.strategy;

/**
 * @author xuantao
 */
public class UnionPay implements OnlinePay {
    @Override
    public void pay() {
        System.out.println("正在进行银联支付");
    }
}
