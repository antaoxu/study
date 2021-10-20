package com.xat.interview.designPattern.strategy.test;


public class SecondIntercepter implements LoanIntercepter{
    @Override
    public void invoke(Person person) {
        System.out.println("第二种拦截器正在执行");
    }
}
