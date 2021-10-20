package com.xat.interview.designPattern.strategy;

/**
 * @author xuantao
 */
public class WechatPay implements OnlinePay{
    @Override
    public void pay() {
        System.out.println("正在进行微信支付");
    }
}
