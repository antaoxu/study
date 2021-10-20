package com.xat.interview.designPattern.strategy.test;

public class OneIntercepter implements LoanIntercepter{
    @Override
    public void invoke(Person person) {
        System.out.println("第一种拦截器正在执行");
    }
}
