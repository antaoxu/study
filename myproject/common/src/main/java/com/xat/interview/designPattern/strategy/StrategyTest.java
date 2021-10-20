package com.xat.interview.designPattern.strategy;

/**
 * @author xuantao
 */
public class StrategyTest {
    public static void main(String[] args) {
        PayManage payManage = new PayManage();
        payManage.setOnlinePay(new WechatPay());
        payManage.pay();
    }
}
