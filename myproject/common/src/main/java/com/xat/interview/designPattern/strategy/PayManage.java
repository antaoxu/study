package com.xat.interview.designPattern.strategy;

/**
 * @author xuantao
 */
public class PayManage{
    private OnlinePay onlinePay;

    public OnlinePay getOnlinePay() {
        return onlinePay;
    }

    public void setOnlinePay(OnlinePay onlinePay) {
        this.onlinePay = onlinePay;
    }

    public void pay(){
        onlinePay.pay();
    }
}
